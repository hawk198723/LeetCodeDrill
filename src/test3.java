import java.util.ArrayDeque;
import java.util.Deque;

public class test3 {

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Removing top element: " + stack.pop());
        System.out.println("New top element: " + stack.peek());
    }
}
