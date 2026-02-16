public class SLList {

    SLNode head = null;

    public SLList() {
    }

    public void addy(Song s) {


        SLNode newNode = new SLNode(s);

        if (head == null) {
            head = newNode;
        } else {
            SLNode temp = head;
            while (temp.next != null) {

                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void removy(int pos) {
        SLNode temp = head;
        int count = 0;

        if (pos == 0) {
            head = head.next;
        } else {
            while (count < pos - 1) {
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        SLNode temp = head;
        while(temp != null) {
            sb.append(temp.song + "\n");
            temp = temp.next;
        }
        return sb.toString();
    }


}