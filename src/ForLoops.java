public class ForLoops {

    /**
     * Sample usage:
     * printingHashTags(0) returns ""
     * printingHashTags(4) returns "####"
     * @param num Integer representing the number of hashtags to draw
     * @return A string of hashtags
     */
    public static String printingHashTags(int num) {

        String hashTag = "";
        for (int timesRan = 0; timesRan < num; timesRan++) {
            hashTag += "#";
        }
        return hashTag;
    }

    /**
     * Sample usage:
     * countDown(0, 10) -> “10 9 8 7 6 5 4 3 2 1 0 ”
     * countDown(10, 0) -> “10 9 8 7 6 5 4 3 2 1 0 “
     * @param num1 an integer
     * @param num2 an integer
     * @return a countdown from the largest parameter to the smallest.
     */
    public static String countDown(int num1, int num2) {

        String numberString = "";
        if (num1 >= num2) {
            for (int number = num1; number >= num2; number--) {
                numberString += number + " ";
            }
        }
        else {
            for (int number = num2; number >= num1; number--) {
                numberString += number + " ";
            }
        }
        return numberString;
    }

    public static int sumNumbers(int num1, int num2) {

        int sum = 0;
        if (num1 > num2) {
            for (int number = num2; number <= num1; number++) {
                sum += number;
            }
        }
        else if (num1 < num2) {
            for (int number = num1; number <= num2; number++) {
                sum += number;
            }
        }
        else {
            sum = num1 + num2;
        }
        return sum;
    }

    public static int power(int num1, int num2) {
        int total = 1;
        for (int currentPower = 0; currentPower < num2; currentPower++) {
            total *= num1;
        }
        return total;
    }


}
