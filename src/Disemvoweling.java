import java.util.Scanner;

public class Disemvoweling {
    public static void main(String[] args) {
        String str = "";
        boolean answerValid = false;
        String userAnswer = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the disemvoweling utility. \nEnter your phrase: ");
        str = scan.nextLine();
        System.out.println("The disemvoweled phrase is: " + disemvowel(str));
        System.out.println("Would you like to remove repeating letters? Enter y for yes or n for no.");
        userAnswer = scan.nextLine();
        while (!answerValid) {
            if (userAnswer.equals("y")) {
                System.out.println("The new phrase is: " + removeRepeatedLetters(str));
                answerValid = true;
            } else if (userAnswer.equals("n")) {
                answerValid = true;
            } else {
                System.out.println("Please enter a valid answer.");
                userAnswer = scan.nextLine();
            }
        }
    }

    // The following method removes all vowels from str and returns the final string, as well as the length decrease and percentage decrease.
    public static String disemvowel(String str) {
        int oldLength = str.length();
        str = removeVowel(str, "a");
        str = removeVowel(str, "e");
        str = removeVowel(str, "i");
        str = removeVowel(str, "o");
        str = removeVowel(str, "u");
        return str + "\nReduced from " + oldLength + " to " + str.length() + " characters. Reduction rate of " + (int) (((double) (oldLength - str.length()) / oldLength) * 100) + "%";
    }

    // The following method checks string for all instances of letter, whether they be uppercase or lowercase, and removes them.
    public static String removeVowel(String str, String letter) {
        String lowercaseLetter = letter.toLowerCase();
        String uppercaseLetter = letter.toUpperCase();
        boolean lettersReplaced = false;
        while (!lettersReplaced) {
            if (str.indexOf(lowercaseLetter) == -1) {
                if (str.indexOf(uppercaseLetter) == -1) {
                    lettersReplaced = true;
                } else {
                    str = (str.substring(0, str.indexOf(uppercaseLetter)) + (str.substring((str.indexOf(uppercaseLetter) + 1))));
                }
            } else {
                str = (str.substring(0, str.indexOf(lowercaseLetter)) + (str.substring((str.indexOf(lowercaseLetter) + 1))));
            }
        }
        return str;
    }

    public static String removeRepeatedLetters (String str) {
        boolean repeatsRemoved = false;
        int positionOfLetter = 0;
        int lettersRemoved = 0;
        while (!repeatsRemoved) {
            if (positionOfLetter <= (str.length() - (1 - lettersRemoved))) {
                if (str.substring(positionOfLetter, (positionOfLetter + 1)).equals(str.substring((positionOfLetter + 1), (positionOfLetter + 2)))) {
                    str = str.substring(0, positionOfLetter) + str.substring(positionOfLetter + 1);
                    lettersRemoved += 1;
                } else {
                    positionOfLetter++;
                }
            }
            else {
                repeatsRemoved = true;
            }
        }
        return str;
    }
}
