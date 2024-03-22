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
}
