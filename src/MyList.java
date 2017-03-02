/**
 * Created by Himasha De Silva on 3/2/2017.
 */
//import java.util.NoSuchElementException;

public class MyList<E> {

    private class Node {

        E elem;
        Node next;

        public Node(E elem) {
            this.elem = elem;
        }

        public Node(E el, Node node) {
            this.elem = el;
            this.next = node;
        }

    }


}
