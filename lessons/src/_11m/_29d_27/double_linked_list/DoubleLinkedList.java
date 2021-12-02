package _11m._29d_27.double_linked_list;

import java.util.Iterator;

public class DoubleLinkedList implements Iterable<Integer>{
    private Node head;

    void addNode(int data)
    {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node curr = head;
        while (curr.next != null)
            curr = curr.next;

        Node newNode = new Node(data, curr);
        curr.next = newNode;
    }

    void printList(Node n)
    {
        int i = 0;
        while (n != null) {
            System.out.print(((i%10==0)?"\n":" ") + n.data);
            n = n.next;
            i++;
        }
    }
    void swap(Node a, Node b){
        Node tmp, tmpPrev, tmpNext;
        tmpPrev = a.prev;
        tmpNext = a.next;


        if(a.prev != null) {
            a.prev.next=b;
        }
        if(a.next != null){
            a.next.prev=b;
        }
        if (b.prev != null) {
            b.prev.next=a;
        }
        if(b.next != null) {
            b.next.prev=a;
        }
        a.prev = b.prev;
        a.next = b.next;
        b.prev = tmpPrev;
        b.next = tmpNext;
        if(a.prev==null){
            this.head=a;
        }
        if(b.prev==null){
            this.head=b;
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node currentNode = head;
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public Integer next() {
                if(this.hasNext()){
                    int data = this.currentNode.data;
                    this.currentNode = this.currentNode.next;
                    return data;
                }
                return null;
            }
        };
    }
}
