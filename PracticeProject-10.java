import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
    public static void main(String[] args) {
        // Sample text
        String text = "Hello World Good morning. " +
                      "Hello world Good night.";;

        // Regular expression pattern to match words containing "world"
        String regex = "\\b\\w*world\\w*\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Find and print matches
        System.out.println("Words containing 'world':");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // Replace "world" with "universe"
        String replacedText = text.replaceAll("world", "universe");

        System.out.println("\nText after replacing 'world' with 'universe':");
        System.out.println(replacedText);
    }
}