package de.kacperbak.localclass;

/**
 * Created by bakka on 08.01.15.
 */
public class OuterClass {

    private String regularExpression = "[^0-9]";

    public boolean validatePhoneNumber(String phoneNumber){

        //below Java 8 this local variable has to be final
        int numberLength = 10;

        /**
         * Create local class
         */
        class PhoneNumber{

            private static final int CONST = 1000;

            private String formattedPhoneNumber;

            PhoneNumber(String rawNumber) {
                this.formattedPhoneNumber = formatNumber(rawNumber);
            }

            public String getFormattedPhoneNumber() {
                return formattedPhoneNumber;
            }

            private String formatNumber(String rawNumber){
                String filteredNumber = filterNumberForDigits(rawNumber);
                return validateNumberForLength(filteredNumber);
            }

            /**
             * Access member of OuterClass - regularExpression
             */
            private String filterNumberForDigits(String rawNumber){
                regularExpression = "";
                return rawNumber.replaceAll( regularExpression , "");
            }

            /**
             * Access variable of current method - numberLength - has been captured!
             */
            private String validateNumberForLength(String filteredNumber){
                //numberLength = 7;
                return ( filteredNumber.length() ==  numberLength) ? filteredNumber : null;
            }
        }
        
        PhoneNumber processedNumber = new PhoneNumber(phoneNumber);
        return processedNumber.getFormattedPhoneNumber() != null;
    }
}
