import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pattern pattern = null;
        Matcher match = null;
        boolean isValid = false;

        // ============================================================
        System.out.println("1. Password Validation");
        // (10 points)

        // Validation of Password

        System.out.print("Enter Password: ");
        String password = scan.nextLine();

        // Provide the pattern
        pattern = Pattern.compile("^lumelay20$");

        match = pattern.matcher(password);

        isValid = match.matches();

        if (isValid) {
            System.out.println("Password is valid! ");
        } else {
            System.out.println("Password is invalid! ");
        }

        // ============================================================
        System.out.println("2. Personal Email Address Validation");
        // (10 points)

       // Validation of Email Address

        System.out.print("Enter Email: ");
        String email = scan.nextLine();

        // Provide regex pattern
        pattern = Pattern.compile("^.*$");

        match = pattern.matcher(email);

        isValid = match.matches();

        if (isValid) {
            System.out.println("Valid email!");
        } else {
            System.out.println("Invalid email!");
        }

        // ============================================================
        System.out.println("3. URL Validation");
        // (10 points)

        //Validation of URL

        System.out.print("Enter URL: ");
        String url = scan.nextLine();

        // Provide regex pattern
        // https://www.facebook.com/Keithninolumelay/
        pattern = Pattern.compile("^.*$");

        match = pattern.matcher(url);

        isValid = match.matches();

        if (isValid) {
            System.out.println("Valid URL!");
        } else {
            System.out.println("Invalid URL!");
        }

        // ============================================================
        System.out.println("4. Finding and retrieving files.");
        // (10 points)

        //Finding and retrieving 

        String myfiles = "report.pptx ,project2019.xlsx, assignment2020.docx, registration2020.txt, helloworld.py, snake.java, hacker.cpp";

        // Provide regex pattern
        pattern = Pattern.compile("^.*$");
        match = pattern.matcher(myfiles);

        boolean found = false;

        while (match.find()) {
            System.out.println("I found the text " + match.group());
            found = true;
        }
        if (!found) {
            System.out.println("No files found.");
        }

        // ============================================================
        System.out.println("5. Search and remove hashtag");
        // (10 points)

        String tweet = "I'd pet a million stray pit bulls before I'd eat a single pink-slimy McBite. #McDStories http://bit.ly/wd0BDe";

        tweet = tweet.replaceAll("^.*$", "I'd pet a million stray pit bulls before I'd eat a single pink-slimy McBite. ");

        System.out.println(tweet);

        // ============================================================
        System.out.println("6. Search and remove URL");
        // (10 points)

        tweet = "The oldest living survivor of the Japanese Attack on Pearl Harbor in 1941 celebrated his upcoming 105th birthday at the National World War II Museum in New Orleans. Joseph Eskenazi of Redondo Beach, California, boarded a train Friday for the journey. http://apne.ws/AayqsiC";


        tweet = tweet.replaceAll("(http[^ ]*)", "");

        System.out.println(tweet);

        // ============================================================
        System.out.println("7. Search and remove special characters");
        // (10 points)

        tweet = "Press On, three, was killed training this morning at Santa Anita – “musculoskeletal,” for now. He is the sixth dead horse at Cal tracks through the first three weeks of 2023. “Reform” is a ruse, “safe racing” a lie. Horseracing kills; it must end.";

        tweet = tweet.replaceAll("[\\W+]", " ");

        System.out.println(tweet);

        scan.close();
    }
}
