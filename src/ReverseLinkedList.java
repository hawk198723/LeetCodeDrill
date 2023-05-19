import java.util.LinkedList;
import java.util.Collections;

public class ReverseLinkedList {

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> l){
        LinkedList<Integer> reversed = new LinkedList<>(l);
        Collections.reverse(reversed);
        return reversed;
    }

    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);

        LinkedList<Integer> reversedList = reverseLinkedList(list);

        System.out.println("Reversed list: " + reversedList);
    }
}