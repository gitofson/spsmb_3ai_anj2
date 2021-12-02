package _11m._29d_27.double_linked_list;

import java.util.Iterator;

public class DoubleLinkedList implements Iterable<Integer>{
    private Node head;

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
