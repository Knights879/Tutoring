import java.util.List;
import java.util.ArrayList;

/**
 * @author Knights879
 */
public class ALExample {
    // Member Vars/Instance Vars
    public ArrayList<Integer> constrList;
    public static List<Integer> statList;

    // Constructor
    public ALExample() {
        this.constrList = new ArrayList<Integer>();  // 'this' is not necessary, since it is implied
    }

    // Main Method
    public static void main(String args[]) {
        statList = new ArrayList<Integer>();
        ALExample ale = new ALExample();
        ALExample ale2 = new ALExample();

        printListStatic(ale);
        //ale.printList();
        printListStatic(ale2);
        System.out.println("constrList.isEmpty() ?= " + ale.constrList.isEmpty() + "\n");

        System.out.println("Populate 'constrList' and 'statList'.");
        ale.constrList.add(1);
        ale.constrList.add(2);
        ale.constrList.add(3);
        ALExample.statList.add(1);
        ALExample.statList.add(2);
        ALExample.statList.add(3);
        printListStatic(ale);
        printListStatic(ale2);

        System.out.println("constrList.isEmpty() ?= " + ale.constrList.isEmpty());
        System.out.println("The second element in 'constrList' is: " + ale.constrList.get(1));
        System.out.println("'constrList' contains the element '4'? " + ale.constrList.contains(4));
        System.out.println();

        System.out.println("Add 0 to 'constrList' at position 0");
        ale.constrList.add(0, 0);
        System.out.println("Remove the third element from 'constrList'");
        ale.constrList.remove(2);
        printListStatic(ale);

        System.out.println("Remove the third element from 'statList'");
        ALExample.statList.remove(2);
        System.out.println("Set the second element in 'statList' to 10");
        ALExample.statList.set(1, 10);
        printListStatic(ale);

        Integer number = ale.constrList.get(1);
        System.out.println("Second element in constrList: " + number);
        int num = ale.constrList.remove(1);
        System.out.println("Removed second element from list.");
        ale.constrList.add(num);
        System.out.println("Added " + num + "back at the end of constrList");
        // Auto-boxing/-Unboxing test
        if (ALExample.statList.get(0) == 1)
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println("Clear 'constrList'");
        ale.constrList.clear();
        printListStatic(ale);
    }

    /* Mutator Methods */

    // Reverses the elements in the arraylist
    public void reverse() {
        // TODO: Implement
    }

    /* Accessor Methods */

    // Print (Static)
    // Method header: public static void printListStatic(ALExample alePrint)
    // Method signature: printListStatic(ALExample)
    public static void printListStatic(ALExample alePrint) {
        System.out.println("'printListStatic' called");

        // Print out 'constrList'
        System.out.println("The size of constrList is: " + alePrint.constrList.size());
        System.out.print("constrList: ");
        for (int i : alePrint.constrList)
            System.out.print(i + " ");
        System.out.println();

        // Print out 'statList'
        System.out.println("The size of statList is: " + ALExample.statList.size());
        System.out.print("statList: ");
        for (int i : ALExample.statList)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();
    }

    // Print (Non-Static)
    public void printList() {
        System.out.println("'printList' called");

        // Print out 'constrList'
        System.out.println("The size of constrList is: " + constrList.size());
        System.out.print("constrList: ");
        for (int i : constrList)
            System.out.print(i + " ");
        System.out.println();

        // Print out 'statList'
        System.out.println("The size of statList is: " + ALExample.statList.size());
        System.out.print("statList: ");
        for (int i : ALExample.statList)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();
    }
}
