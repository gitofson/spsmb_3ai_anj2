package _11m._29d_27.linked_list;

public class Test {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(5);
        ll.append(4);
        ll.append(2);
        ll.printList();
        Node n = ll.getHead();
        while (n!=null){
            System.out.println(n.data + " ");
            n=n.next;
        }
        // Po naimplementování rozhraní Iterable k Třídě LinkedList
        //máme možnost používat foreach cyklus:
        for (Object o:ll) {
            System.out.println(o);
        }

    }

}
