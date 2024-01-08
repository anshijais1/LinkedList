public class insertfirstsingly {

    public static void main(String args[]) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.display();
    }

    public static class LL {
        private Node head;
        private Node tail;
        int size;

        public LL() {
            this.size = 0;
            this.head = null;
            this.tail = null;
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
    }
}

