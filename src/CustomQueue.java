public class CustomQueue {
    private Node front;
    private Node rear;
    private int size;

    public CustomQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(Cell cell) {
        Node node = new Node(cell);

        if(isEmpty()) {
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
        size++;
    }

    public Cell dequeue() {
        if (!isEmpty()) {
            Cell data = front.data;
            front = front.next;
            size--;
            return data;
        }
        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Cell cell) {
        Node current = front;
        while (current != null) {
            if (current.data.equals(cell)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
