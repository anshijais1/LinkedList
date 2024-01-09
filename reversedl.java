public class reversedl {
    public static void main(String[] args) {
        DL list = new DL();
        list.insertfirst(5);
        list.insertfirst(4);
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(1);
        list.display();
        list.reverse();
    }

    static class DL {
        private Node head;
        private int size;

        public DL() {
            this.head = null;
            size = 0;
        }

        public class Node {
            int val;
            Node next;
            Node prev;

            public Node(int val) {
                this.val = val;
                this.next = null;
                this.prev = null;
            }
        }

        public void insertfirst(int val) {
            Node newnode = new Node(val);
            newnode.next = head;
            newnode.prev = null;

            if (head != null) {
                head.prev = newnode;
            }

            head = newnode;
            size++;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
        public void reverse() {
            Node temp = head;
        
            // Move to the end of the list
            while (temp.next != null) {
                temp = temp.next;
            }
        
            // Traverse backward and print the reversed list
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.prev;
            }
        }
    }
}