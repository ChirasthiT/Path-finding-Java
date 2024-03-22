public class CustomLinkedList {
    private Node head;
    private int size;

    public CustomLinkedList() {
        head = null;
    }

    public void add(Cell data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

}
