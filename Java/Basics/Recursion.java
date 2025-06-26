/**
 * @author Knights879
 */
public class Recursion {
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        // Test sum
        // int sumNum = sum(5);
        // System.out.println(sumNum);

        // Test fib
        // int fibNum = fib(5);
        // System.out.println(fibNum);

        // Test Collatz
        // collatz(5);

        // Test binary search
        // int target = 3;
        // int[] nums = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // int targetIndex = bSearch(nums, 0, nums.length - 1, target);
        // System.out.println(targetIndex);

        // Tail Recursion
        // drawLine(4);

        // int num = addFun(6);
        // System.out.println(num);

        // for (int i = 0; i < 10; i++)
        //     System.out.println("m = " + i + ", mystery = " + mystery(i));
    }

    /**
     * Calculates the sum of a series of ints from 1 to 'n', when n > 0, recursively.
     * @param n
     * @return int
     */
    public static int sum(int n) {
        // Which piece of code is valid?

        // 1.
        // return n + sum(n - 1);

        // 2.
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);

        // 3.
        // if (n == 1)
        //     return 1;
        // else
        //     return sum(n) + sum(n - 1);
    }

    /**
     * Finds the nth term in the fibonacci sequence using recursion.
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    /**
     * Determines where the Collatz Conjecture is satisfied for the given input.
     * @param n
     */
    public static void collatz(int n) {
        System.out.println(n);

        if (n <= 1)
            return;
        else if (n % 2 == 0)
            collatz(n / 2);
        else
            collatz(3 * n + 1);
    }

    /**
     * Binary search using recursion
     * @param arr
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static int bSearch(int[] arr, int left, int right, int target) {
        if (right >= left) {
            int mid = (left + right) / 2;
            System.out.println(mid + " " + left + " " + right);
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                return bSearch(arr, left, mid - 1, target);
            else
                return bSearch(arr, mid + 1, right, target);
        }
        return -1;
    }

    /**
     * Tail recursion example
     * @param n
     */
    public static void drawLine(int n) {
        if (n == 0)
            System.out.println("Done!");
        else {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
            drawLine(n - 1);
        }
    }

    public static int addFun(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 2;
        return addFun(n - 1) + addFun(n - 2);
    }

    public static int mystery(int n) {
        if (n <= 1)
            return 0;
        else
            return 1 + mystery(n / 2);
    }

    public static void countdown(int n) {
        // Base case
        if (n < 0)
            return;

        System.out.println(n);

        // Recursive step
        countdown(n - 1);
    }
}
