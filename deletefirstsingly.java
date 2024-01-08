public class deletefirstsingly {
    public static void main(String args[]) {
        deletefirstsingly.LL list = new deletefirstsingly().new LL();
        list.insertFirst(3);
        list.insertFirst(8);
         list.insertFirst(2);
          list.insertFirst(11);
           list.insertFirst(13);
        list.deleteFirst();
        list.display();
    }

    class LL {
        private Node head;
        private Node tail;
        private int size;

        public LL() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        class Node {
            int value;
            Node next;

            public Node(int val) {
                this.value = val;
                this.next = null;
            }
        }

        public void insertFirst(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = head;
            }
            size += 1;
        }

        public int deleteFirst() {
            if (head == null) {
                System.err.println("List is empty");
                return -1; // or throw an exception
            }

            int val = head.value;
            head = head.next;
            System.err.println(val);
            if (head == null) {
                tail = null;
            }
            size--;

            return val;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }
}

    

