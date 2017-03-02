/**
 * Created by Himasha De Silva on 3/2/2017.
 */
public class Main {

    public static void main(String[] args){


        MyList<Integer> linkedlist = new MyList<Integer>();

        System.out.println(linkedlist.isEmpty()+" (should print true)");
        System.out.println(linkedlist.hasElements()+" (should print false)");

        linkedlist.add(12);
        System.out.println(linkedlist.remove()+" (should print 12)");
        System.out.println(linkedlist.remove()+" (should print null - no elements to remove)");

        linkedlist.add(56);
        linkedlist.add(72);
        linkedlist.add(80);
        System.out.println(linkedlist.remove()+" (should print 56)");

        System.out.println(linkedlist.isEmpty()+" (should print false - list is not empty)");
        System.out.println(linkedlist.hasElements()+" (should print true - list has elements)");

        System.out.println(linkedlist.remove()+" (should print 72)");
        System.out.println(linkedlist.remove()+" (should print 80)");
        System.out.println();

//=================================================================================
        MyList<String> linkedlist2 = new MyList<String>();

        System.out.println(linkedlist2.isEmpty()+" (should print true)");
        System.out.println(linkedlist2.hasElements()+" (should print false)");

        linkedlist2.add("abc");
        System.out.println(linkedlist2.remove()+" (should print abc)");
        System.out.println(linkedlist2.remove()+" (should print null - no elements to remove)");

        linkedlist2.add("himasha");
        linkedlist2.add("shehan");
        linkedlist2.add("deSilva");
        System.out.println(linkedlist2.remove()+" (should print himasha)");

        System.out.println(linkedlist2.isEmpty()+" (should print false - list is not empty)");
        System.out.println(linkedlist2.hasElements()+" (should print true - list has elements)");

        System.out.println(linkedlist2.remove()+" (should print shehan)");
        System.out.println(linkedlist2.remove()+" (should print deSilva)");

    }

}
