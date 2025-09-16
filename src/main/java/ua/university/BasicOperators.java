package ua.university;


/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] = sum, [1] = average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        return new double[]{(a + b + c), (a + b + c) / 3.0};
    }

    /**
     * Returns the maximum of three integers.
     */
    public static int maxOfThree(int a, int b, int c) {
        if (a > b) {
            if (a > c)
                return a;
            return c;
        } else if (b > c)
            return b;
        return c;
    }

    /**
     * /**
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90–100: 'A'</li>
     *     <li>80–89:  'B'</li>
     *     <li>70–79:  'C'</li>
     *     <li>60–69:  'D'</li>
     *     <li>50–59:  'E'</li>
     *     <li>0–49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        return switch (score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            case 5 -> 'E';
            default -> 'F';
        };
    }

    /**
     * Returns the day of the week name for a number 1-7.
     */
    public static String dayOfWeek(int day) {
        if (day < 1 || day > 7) {
            throw new IllegalArgumentException("");
        }
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("");
        };
    }

    /**
     * Returns an array counting down from n to 1.
     */
    public static int[] countdown(int n) {
        if (n < 0)
            throw new IllegalArgumentException("");

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }

        return result;
    }

    /**
     * Returns factorial of n.
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("");
        }

        long result = 1;

        if (n == 0 || n == 1)
            return result;

        for (int i = 2; i <= n; i++)
            result *= i;

        return result;
    }

    /**
     * Returns a reversed copy of the array.
     */
    public static int[] reverseArray(int[] arr) {
        if (arr == null)
            throw new IllegalArgumentException("");

        int temp;

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    /**
     * Returns sum of all elements in a 2D array (matrix).
     */
    public static int sumMatrix(int[][] matrix) {
        if (matrix == null)
            throw new IllegalArgumentException("");

        int sum = 0;
        for (int[] i : matrix) {
            for (int j : i)
                sum += j;
        }

        return sum;
    }

    /**
     * Checks if a string is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        if (s == null)
            throw new IllegalArgumentException("");

        int i = 0, j = s.length() - 1;
        char[] characters = s.toCharArray();
        while (i < j) {
            if (characters[i] != characters[j])
                return false;

            i++;
            j--;
        }

        return true;
    }

    /**
     * Returns minimum and maximum of an array.
     */
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("");

        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];

            if (max < arr[i])
                max = arr[i];
        }

        return new int[]{min, max};
    }

    /**
     * Returns multiplication table n x n.
     */
    public static int[][] multiplicationTable(int n) {
        if (n < 1)
            throw new IllegalArgumentException("");

        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                result[i][j] = (i + 1) * (j + 1);
        }

        return result;
    }

    /**
     * Returns all even numbers up to n.
     */
    public static int[] evenNumbersUpToN(int n) {
        if (n < 0)
            throw new IllegalArgumentException("");

        int[] result = new int[n / 2];
        for (int i = 1; i <= n / 2; i++)
            result[i - 1] = i * 2;
        return result;
    }

    /**
     * Checks if a number is prime.
     */
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Counts vowels in a string.
     */
    public static int countVowels(String s) {
        if (s == null)
            throw new IllegalArgumentException("");

        int counter = 0;

        char[] characters = s.toCharArray();
        for (char c : characters) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                counter++;
        }

        return counter;
    }

    /**
     * Returns first n Fibonacci numbers.
     */
    public static int[] fibonacci(int n) {
        if (n < 1)
            throw new IllegalArgumentException("");

        int[] result = new int[n];
            result[0] = 0;
            
        if (n >= 2)
            result[1] = 1;

        for (int i = 2; i < n; i++)
            result[i] = result[i - 1] + result[i - 2];

        return result;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     */
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null)
            throw new IllegalArgumentException("");

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     */
    public static int[] sortArray(int[] arr) {
        if (arr == null)
            throw new IllegalArgumentException("");

        int[] copy = arr.clone();

        return quickSortDescending(copy, 0, copy.length - 1);
    }

    public static int[] quickSortDescending(int[] array, int left, int right) {
        int i = left, j = right;
        int pivot = array[(left + right) / 2];

        while (i <= j) {
            while (array[i] < pivot) i++;
            while (array[j] > pivot) j--;

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (left < j)
            quickSortDescending(array, left, j);
        if (i < right)
            quickSortDescending(array, i, right);

        return array;
    }
}
