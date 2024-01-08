public class insertpossingly {
    public static void main(String args[]) {
        insertpossingly.LL list = new insertpossingly().new LL();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertLast(5);
        list.insertLast(11);
        list.insert(45, 3);
        list.display();
    }

    public class LL {
        private Node head;
        private Node tail;
        private int size;

        public LL() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public class Node {
            public int value;
            public Node next;

            public Node(int val, Node next) {
                this.value = val;
                this.next = next;
            }
        }

        public void insertFirst(int val) {
            Node newNode = new Node(val, null);
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
            Node newNode = new Node(val, null);
            if (tail == null) {
                insertFirst(val);
            } else {
                tail.next = newNode;
                tail = newNode;
                size++;
            }
        }

        public void insert(int val, int index) {
            if (index == 0) {
                insertFirst(val);
            } else if (index == size) {
                insertLast(val);
            } else {
                Node temp = head;
                for (int i = 1; i < index; i++) {
                    temp = temp.next;
                }

                Node newNode = new Node(val, temp.next);
                temp.next = newNode;

                // Update tail if inserting at the last index
                if (index == size - 1) {
                    tail = newNode;
                }

                size++;
            }
        }
    }
}

    


