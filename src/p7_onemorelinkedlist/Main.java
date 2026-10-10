package p7_onemorelinkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    static void main() {
        // Create linked list
        LinkedList<Object> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {list.add(i);}

        // Iterate through list
        ListIterator<Object> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
