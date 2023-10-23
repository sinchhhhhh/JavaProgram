public class StringConversionDemo {
    public static void main(String[] args) {
        // Create a string
        String originalString = "Hello, World!";

        // Convert to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Convert to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Display the original string
        System.out.println("Original String: " + originalString);

        // Display the StringBuffer
        System.out.println("StringBuffer: " + stringBuffer);

        // Display the StringBuilder
        System.out.println("StringBuilder: " + stringBuilder);
    }
}