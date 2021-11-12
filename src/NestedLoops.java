public class NestedLoops {

    public static String xSquare(int n) {

        String string = "";
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                string += "X";
            }
            string += "\n";
        }
        return string;
    }

    public static String flippedTriangle(int n) {

        String string = "";
        for (int row = 1; row <= n; row++) {
            for (int column = row; column <= n; column++) {
                string += "*";
            }
            string += "\n";
        }
        return string;
    }

    public static String fizzBuzz(int n) {

        String string = "";
        for (int i = 1; i <= n; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                string += "FizzBuzz";
            }
            else if ((i % 3) == 0) {
                string += "Fizz";
            }
            else if ((i % 5) == 0) {
                string += "Buzz";
            }
            else {
                string += i;
            }
            if ((i % 20) == 0) {
                string += "\n";
            }
            else {
                string += " ";
            }
        }
        return string;
    }

    public static String sideways () {
        String string = "";
        for (int row1 = 1; row1 <= 5; row1++) {
                for (int space = row1; space <= 4; space++) {
                    string += "  ";
                }
                for (int number = row1; number >= 1; number--) {
                    string += number + " ";
                }
            string += "\n";
        }
        for (int row2 = 4; row2 >= 1; row2--) {
                for (int space = row2; space <= 4; space++) {
                    string += "  ";
                }
                for (int number = row2; number >= 1; number--) {
                    string += number + " ";
                }
                string += "\n";
        }
        return string;
    }
}
