/**
 * Created by Himasha De Silva on 3/2/2017.
 */

public class MyList<T> {

    private Node head; // the first element
    private Node tail; // the last element
    private int size; //size of list

    public MyList(){
        this.size=0;
    }

    private class Node {

        T elem;
        Node next;

        public Node(T elem) {
            this.elem = elem;
        }

        public Node(T t, Node node) {
            this.elem = t;
            this.next = node;
        }

    }

    public void add(T t){

        if(head == null){

            head = tail = new Node(t);

        }
        else{
            tail.next = new Node(t);
            tail = tail.next;
        }
        size++;
    }

    public boolean isEmpty(){

        return head == null;
    }

    public void print(){
        System.out.println(head.next.elem);
    }

}
