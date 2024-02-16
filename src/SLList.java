import java.util.LinkedList;

public class SLList<T> {
    private SLNode<T> head;
    public SLList() {
        head = null;
    }

    public void listAdd(T item) {
        SLNode<T> newNode = new SLNode<>(item);
        if (head == null) {
            head = newNode;
        } else {
            SLNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void listRemove(int pos) {
        if (head == null || pos < 0) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            throw new IndexOutOfBoundsException("Invalid");
        }
        SLNode<T> current = head;
        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        current.next = current.next.next;
    }

    public String toString() {
        if (head == null) {
            return "Empty List ";
        }
        StringBuilder sb = new StringBuilder();
        SLNode<T> current = head;
        while(current != null){
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
    }






