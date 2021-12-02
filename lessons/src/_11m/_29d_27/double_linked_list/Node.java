package _11m._29d_27.double_linked_list;

public class Node {
    private Integer data;
    private Node prev;
    private Node next;

    public Node(Integer data, Node prev) {
        this.data = data;
        this.prev = prev;
    }

    public Node(Integer data) {
        this.data = data;
        this.prev = null;
    }
}
