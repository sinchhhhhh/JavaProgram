public class MethodDemo {
    // Method with no parameters and no return value (void)
    public static void greet() {
        System.out.println("Hello, World!");
    }

    // Method with parameters and return value
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling methods in different ways

        // 1. Calling a method with no parameters and no return value
        greet();

        // 2. Calling a method with parameters and storing the return value
        int sum = add(5, 3);
        System.out.println("The sum is: " + sum);

        // 3. Calling a method with inline parameters and using the return value
        int result = add(7, 2) + add(4, 6);
        System.out.println("Result: " + result);

        // 4. Calling methods with different argument types
        String message = formatGreeting("John", "Smith");
        System.out.println(message);

        // 5. Calling methods with overloaded versions
        int sum1 = add(2, 3);
        double sum2 = add(2.5, 3.5);
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
    }

    // Method with parameters and return value (overloaded version)
    public static double add(double a, double b) {
        return a + b;
    }

    // Method with parameters and return value
    public static String formatGreeting(String firstName, String lastName) {
        return "Hello, " + firstName + " " + lastName + "!";
    }
}