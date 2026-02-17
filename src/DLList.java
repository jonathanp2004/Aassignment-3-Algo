public class DLList {
    DLNode head = null;


    public DLList() {
    }


    public void addy(Song s){
        DLNode newNode = new DLNode(s);
        if(head == null){
            head = newNode;
        }else {
            DLNode temp = head;
            while (temp.next != null) {

                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    public void removy(int pos){
        DLNode temp = head;
        int count = 0;
        if (pos == 0) {
            head = head.next;
            head.prev = null;
        }else{
            while ( count < pos ){
                temp = temp.next;
                count ++;
            }
           temp.prev.next = temp.next;
            if(temp.next  != null){
                temp.next.prev = temp.prev;
            }
        }

    }



    public String toString() {
        StringBuilder sb = new StringBuilder();
        DLNode temp = head;
        while(temp != null) {
            sb.append(temp.song + "\n");
            temp = temp.next;
        }
        return sb.toString();
    }
}
