import java.util.Queue;
import java.util.LinkedList;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(8);
        System.out.println("Added " + queue.element() + " to the queue.");
        queue.add(5);
        System.out.println("Added " + queue.element() + " to the queue.");
        queue.add(4);
        System.out.println("Added " + queue.element() + " to the queue.");
        queue.add(7);
        System.out.println("Added " + queue.element() + " to the queue.");

        int removed = queue.remove();
        System.out.println(removed + " was removed from the queue.");
        System.out.println(queue.element() + " is now at the front of the queue.");
    }
}
