public class insertlastsingly {

    public static void main(String args[]) {
        insertlastsingly.LL list = new insertlastsingly().new LL();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertLast(5);
        list.insertLast(11);
        list.display();
    }

    public class LL {
        private Node head;
        private Node tail;
        int size;

        public LL() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public class Node {
            private int value;
            private Node next;

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

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }

        public void insertLast(int val) {
            Node newNode = new Node(val);
            if (tail == null) {
                insertFirst(val);
            } else {
                tail.next = newNode;
                tail = newNode;
                size++;
            }
        }
    }
}


