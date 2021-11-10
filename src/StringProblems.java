public class StringProblems {

    public static String addHyphens(String s) {

        int stringLength = s.length();
        String endString = "";
        for (int t = 0; t < stringLength - 1; t++) {
            endString += s.substring(t, (t+1)) + "-";
        }
        endString += s.substring(stringLength - 1);
        return endString;
    }

    public static String everyOtherLetter(String s) {

        String endString = "";
        int stringLength = s.length();
        for (int t = 0; t < stringLength; t += 2) {
            endString += s.substring(t, (t + 1));
        }
        return endString;
    }


    public static String differentStrings(String s1, String s2) {

        boolean differenceFound = false;
        int number = 0;
        String endString = "";
        if (s1.equals(s2) == true) {
            endString = s1 + " and " + s2 + " are the same";
        }
        else {
            while (!differenceFound) {
                if (s1.substring(number, (number + 1)) != s2.substring(number, (number + 1))) {
                    differenceFound = true;
                    endString = s1 + " and " + s2 + " are not the same. They differ at letter number " + number;
                }
                else {
                    number++;
                }
            }
        }
        return endString;
    }

    public static boolean isPalindrome(String word) {
        return true;
    }
}
