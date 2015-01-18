package de.kacperbak;

/**
 * Created by bakka on 11.01.15.
 */
public class OuterClassAnonymous {

    private String regularExpression = "[^0-9]";

    interface PhoneNumber{
        public String getFormattedPhoneNumber(String rawNumber);
    }

    public boolean validatePhoneNumberCaptured(String phoneNumber){

        /**
         * Variable inside the enclosing block, can be captured
         */
        int numberLength = 10;

        PhoneNumber processedNumber = new PhoneNumber(){

            @Override
            public String getFormattedPhoneNumber(String rawNumber) {
                return formatNumber(rawNumber);
            }

            private String formatNumber(String rawNumber){
                String filteredNumber = filterNumberForDigits(rawNumber);
                return validateNumberForLength(filteredNumber);
            }

            private String filterNumberForDigits(String rawNumber){
                return rawNumber.replaceAll( regularExpression , "");
            }

            /**
             * Access variable of current method - numberLength - has been captured!
             */
            private String validateNumberForLength(String filteredNumber){
                //Write access violation to captured variable, 'numberLength' should be final OR effectively final!
                //numberLength = 7;

                //Capturing
                int numberLength = 7;
                return ( filteredNumber.length() == numberLength ) ? filteredNumber : null;
            }
        };

        return processedNumber.getFormattedPhoneNumber(phoneNumber) != null;
    }

    public boolean validatePhoneNumberShadowed(String phoneNumber){

        PhoneNumber processedNumber = new PhoneNumber(){

            /**
             * Additional member, can be shadowed
             */
            private int numberLength = 10;

            @Override
            public String getFormattedPhoneNumber(String rawNumber) {
                return formatNumber(rawNumber);
            }

            private String formatNumber(String rawNumber){
                String filteredNumber = filterNumberForDigits(rawNumber);
                return validateNumberForLength(filteredNumber);
            }

            private String filterNumberForDigits(String rawNumber){
                return rawNumber.replaceAll( regularExpression , "");
            }

            /**
             * Access variable of current method - numberLength - has been captured!
             */
            private String validateNumberForLength(String filteredNumber){

                /**
                 * Attempt to shadow the additional member, same type (int) and same name (numberLength)
                 */
                int numberLength = 7;

                /**
                 * Resolve shadowing issue with 'this' operator
                 */
                return ( filteredNumber.length() ==  this.numberLength) ? filteredNumber : null;
            }
        };

        return processedNumber.getFormattedPhoneNumber(phoneNumber) != null;
    }


}
