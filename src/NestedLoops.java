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
        for (int row = 1; row <= 5; row++) {
            for (int spaces = row; spaces <= 4; spaces++) {
                string += " ";
            }
            for (int numbers = 5; numbers >= 1; numbers++) {
                string += 5 - numbers;
            }
        }
        return "a";
    }
}
