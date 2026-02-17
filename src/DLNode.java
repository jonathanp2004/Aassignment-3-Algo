public class DLNode<T> {
    T type;
    DLNode next = null;
    DLNode prev = null;

    public DLNode(T type) {
        this.type = type;
    }
}
