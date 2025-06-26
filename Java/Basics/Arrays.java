// import java.util.ArrayList;

/**
 * @author kwhiting
 */
public class Arrays {
    public static void main(String[] args) {
        // // declares an array of integers
        // int[] anArray;
        // ArrayList al = new ArrayList();
        // String name = " Karin ";
        // String lName = "Whiting";
        // String city = "Orlando";
        // int data = 0;

        // al.add(data);
        // al.add(name);

        // // allocates memory for 10 integers
        // anArray = new int[10];

        // // initialize first element
        // anArray[0] = 100;
        // // initialize second element
        // anArray[1] = 200;
        // // and so forth
        // anArray[2] = 300;

        // System.out.println("Element at index 0: "
        //                    + anArray[0]);
        // System.out.println("Element at index 1: "
        //                    + anArray[1]);
        // System.out.println("Element at index 2: "
        //                    + anArray[2]);

        // // Creating and initialzing in a single statement
        // int[] anotherArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

        // for(int index = 0; index < anotherArray.length; index++)
        //     System.out.println("Element at index: " + index + " is " + anotherArray[index]);

        // // Multiple dimension array
        // String[][] names = { {"Mr. ","Mrs. ","Ms. "},
        //                      {"Smith", "Jones"} };

        // for(int row = 0; row < names.length; row++)
        //     for(int col = 0; col < names[row].length; col++)
        //         System.out.println("Element at row: " + row + " and " + " column " + col + " is: " + names[row][col]);

        // copying arrays
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        // static method call; don't have to create an instance of System to use it
        System.out.println("size of copyFrom " + copyFrom.length);
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));

        char[] copyToo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        System.out.println(new String(copyToo));
    }
}
