import java.util.Scanner;

public class Disemvoweling {
    public static void main (String[] args) {
        String str = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the disemvoweling utility. \nEnter your phrase: ");
        str = scan.nextLine();
        System.out.print("The disemvoweled phrase is: " + disemvowel(str));

    }

    public static String disemvowel (String str) {
         boolean aFinished = false, eFinished = false, iFinished = false, oFinished = false, uFinished = false;
         String disemvoweledString = str;
        while (!aFinished) {
            if (str.indexOf("a") == -1) {
                if (str.indexOf("A") == -1) {
                    aFinished = true;
                }
                else {
                    disemvoweledString = (str.substring(0, str.indexOf("A")) + (str.substring((str.indexOf("A") + 1))));
                }
            }
            else {
                disemvoweledString = (str.substring(0, str.indexOf("a")) + (str.substring((str.indexOf("a") + 1))));
            }
        }
    }
}
