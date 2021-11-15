import java.util.Scanner;

public class Disemvoweling {
    public static void main(String[] args) {
        String str = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the disemvoweling utility. \nEnter your phrase: ");
        str = scan.nextLine();
        System.out.print("The disemvoweled phrase is: " + disemvowel(str));

    }

    // The following method removes all vowels from str and returns the final string, as well as the length decrease and percentage decrease.
    public static String disemvowel(String str) {
        String string = str;
        string = removeLetter(string, "a");
        string = removeLetter(string, "e");
        string = removeLetter(string, "i");
        string = removeLetter(string, "o");
        string = removeLetter(string, "u");
        return string + "\nReduced from " + str.length() + " to " + string.length() + " characters. Reduction rate of " + (((str.length() - string.length()) / str.length()) * 100) + "%";
    }

    // The following method checks string for all instances of letter, whether they be uppercase or lowercase, and removes them.
    public static String removeLetter(String string, String letter) {
        String finalString = string;
        String lowercaseLetter = letter.toLowerCase();
        String uppercaseLetter = letter.toUpperCase();
        boolean lettersReplaced = false;
        while (!lettersReplaced) {
            if (string.indexOf(lowercaseLetter) == -1) {
                if (string.indexOf(uppercaseLetter) == -1) {
                    lettersReplaced = true;
                } else {
                    finalString = (finalString.substring(0, finalString.indexOf(uppercaseLetter)) + (finalString.substring((finalString.indexOf(uppercaseLetter) + 1))));
                }
            } else {
                finalString = (finalString.substring(0, finalString.indexOf(lowercaseLetter)) + (finalString.substring((finalString.indexOf(lowercaseLetter) + 1))));
            }
        }
        return finalString;
    }
}
