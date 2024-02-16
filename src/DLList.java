import java.lang.String;
public class DLList<T> {
    DLNode<T> head;

    public DLList() {
        head = null;
    }
    //adds an item to the end of list
    public void listAdd(T item) {
        DLNode<T> newNode = new DLNode(item);
        if (head == null) {
            head = newNode;
        } else {
            DLNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            current.prev = current;
        }
    }

    public void listRemove(int pos) {
        if (head == null || pos < 0) {
            throw new IndexOutOfBoundsException("Invalid");
        }
        if (0 == pos) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        DLNode<T> current = head;
        for (int i = 0; current != null && i < pos; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        //if (current.next != null) {
            //current.next.prev = current.prev;
        //}
    }
    @Override
    public String toString() {
        if (head == null) {
            return "The List is empty";
            }
            StringBuilder sb = new StringBuilder();
            DLNode<T> current = head;
            while(current != null){
                sb.append(current.data.toString()).append("\n");
                current = current.next;
            }
            return sb.toString();
        }
    }
