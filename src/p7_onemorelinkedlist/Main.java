package p7_onemorelinkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    static void main() {
        // Create linked list and determine k
        LinkedList<Object> list = new LinkedList<>();
        for (int i = 1; i < 6; i++) {list.add(i);}
        int k = 2;

        System.out.printf("Reversing every %d elements of %s.\n", k, list);

        // Reverse every k elements of list
        reverseLinkedList(list, k);

        // Output modified list to user
        System.out.printf("The result is %s.\n", list);
    }

    public static void reverseLinkedList(LinkedList<Object> list, int k) {
        // Iterate through list, reversing every k elements
        ListIterator<Object> iterator = list.listIterator();

        for (int i = 0; i < list.size() / k; i++) {
            LinkedList<Object> reversed = new LinkedList<>();

            for (int j = 0; j < k; j++) {
                reversed.addFirst(iterator.next());
                iterator.remove();
            }

            while (!reversed.isEmpty()) {
                iterator.add(reversed.removeFirst());
            }
        }
    }
}
