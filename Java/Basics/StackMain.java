import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(3);
        System.out.println("Pushed " + stack.peek() + " to the stack.");
        stack.push(1);
        System.out.println("Pushed " + stack.peek() + " to the stack.");
        stack.push(4);
        System.out.println("Pushed " + stack.peek() + " to the stack.");
        stack.push(2);
        System.out.println("Pushed " + stack.peek() + " to the stack.");

        int removed = stack.pop();
        System.out.println(removed + " was popped from the stack.");
        System.out.println(stack.peek() + " is now at the top of the stack.");

        //
    }
}
