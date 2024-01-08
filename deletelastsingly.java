public class deletelastsingly {
    public static void main(String[] args) {
        
        deletelastsingly.LL list = new deletelastsingly().new LL();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(11);
         list.insertFirst(13);
      list.deletelast();
      list.display();

    }
    class LL{
        private Node head;
        private Node tail;
        private int size;
        public LL(){
            this.head=null;
            this.tail=null;
            size=0;
        }
        public class Node{
public int val;
public  Node next;

            public Node(int val){
                this.val=val;
                this.next=null;
            }
        }
        public Node get(int index){
            Node node=head;
            for(int i=0;i<index;i++){
                node=node.next;

            }
            return node;
        }
        public void deletelast(){
            if(size<=1){
                deletelast();
            }
            else{
            Node secondlast=get(size-2);
            System.out.println(tail.val);
            secondlast.next=null;
            tail=secondlast;

        }}
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
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
    }
}
