package de.kacperbak;

/**
 * Created by bakka on 07.01.15.
 */
public class OuterClassNested {

    private static String outerFieldStatic = "myOuterFieldStatic";

    private String outerField;

    public OuterClassNested(String outerField) {
        this.outerField = outerField;
    }

    public String getOuterField() {
        return outerField;
    }

    public String useInnerInstance(){
        InnerClass ic = new InnerClass("useInnerInstance");
        return ic.getInnerField();
    }

    /**
     * The name: StaticNestedInstance looks weird, but there are NO real static classes in Java!
     * @return
     */
    public String useStaticNestedInstance(){
        StaticNestedClass sc = new StaticNestedClass("useStaticNestedInstance");
        return sc.getStaticNestedField();
    }

    public static String getOuterFieldStatic() {
        return outerFieldStatic;
    }

    /**
     * Inner class
     * Can access OuterClass members
     */
    public class InnerClass{

        //A constant (final) can be defined as static
        public static final String CONST = "abc";

        //A member can't be defined as static
        private String innerField;

        public InnerClass(String innerField) {
            this.innerField = innerField;
        }

        public String getInnerField() {
            return innerField;
        }

        public String fetchOuterField(){
            return outerField;
        }
    }

    /**
     * Static nested class
     * CAN'T access OuterClass members
     */
    public static class StaticNestedClass{

        private String staticNestedField;

        private static String staticNestedFieldStatic;

        public StaticNestedClass(String staticNestedField) {
            this.staticNestedField = staticNestedField;
        }

        public String getStaticNestedField() {
            return staticNestedField;
        }

        public static void setStaticNestedFieldStatic(String staticNestedFieldStatic) {
            StaticNestedClass.staticNestedFieldStatic = staticNestedFieldStatic;
        }

        public static String getStaticNestedFieldStatic() {
            return staticNestedFieldStatic;
        }

        public static String getOuterField() {
            return outerFieldStatic;
        }
    }

}
