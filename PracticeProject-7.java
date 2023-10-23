public class OuterClass {
    private String outerMessage = "This is the outer class.";

    // Member Inner Class
    class InnerClass {
        public void displayMessage() {
            System.out.println("Inner class says: " + outerMessage);
        }
    }

    // Static Nested Class
    static class StaticNestedClass {
        public void displayMessage() {
            System.out.println("Static nested class.");
        }
    }

    public static void main(String[] args) {
        // Creating instances of inner classes

        // Member Inner Class
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.displayMessage();

        // Static Nested Class
        OuterClass.StaticNestedClass staticNestedObject = new OuterClass.StaticNestedClass();
        staticNestedObject.displayMessage();
    }
}