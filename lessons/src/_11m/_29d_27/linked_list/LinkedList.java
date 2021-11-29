package _11m._29d_27.linked_list;

import java.util.Iterator;

public class LinkedList implements Iterable{
    //hlavička, začátek seznamu
    private Node head;
    public void append(int data){
        //spojový seznam je prázdný, v hlavičce je null
        if (this.head == null) {
            this.head = new Node(data);
            return;
        }
        //pokud není prázdný, najdu konec a přidám nový Node

        Node curr = this.head;
        while (curr.next != null)
            curr = curr.next;

        Node newNode = new Node(data);
        curr.next = newNode;
    }

    public Node getHead() {
        return head;
    }

    void printList()
    {
        Node n = this.head;
        int i = 0;
        while (n != null) {
            System.out.print(((i%10==0)?"\n":" ") + n.data);
            n = n.next;
            i++;
        }
    }
    public void bubbleSort(){
        Node current = this.head;
        int n = 0;
        while(current != null){
            n++;
            current=current.next;
        }
        for (int i = 0; i < n-1; i++) {
            current = this.head;
            for (int j = 0; j < n-i-1; j++) {
                if(current.compareTo(current.next)>0){
                    int tmp = current.data;
                    current.data = current.next.data;
                    current.next.data = tmp;
                }
                current = current.next;
            }

        }
    }
    @Override
    public Iterator iterator() {
        return new Iterator() {
            //Výhoda této vnitřní (a anonymní) třídy:
            //vidíme na členskou proměnnou (head) vnější třídy
            private Node current = head;
            @Override
            public boolean hasNext() {
                return this.current != null;
            }

            @Override
            public Object next() {
                if(this.hasNext()){
                    int data = this.current.data;
                    this.current = this.current.next;
                    return data;
                }
                return null;
            }
        };
    }
}
