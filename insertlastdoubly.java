public class insertlastdoubly {
    public static void main(String[] args) {
        insertlastdoubly.DL list = new insertlastdoubly().new DL();
        
        list.insertlast(5);
        list.insertlast(4);
        list.insertlast(3);
        list.insertlast(2);
        list.insertlast(1);
        list.display();
    }
    class DL{
        private Node head;
       
    
        public DL(){
            this.head=null;
           
        }
        public class Node{
            int val;
            Node next;
             private Node prev;
            public Node(int val){
                this.val=val;
                this.prev=null;
                this.next=null;
            }
        }

        public void insertlast(int val){
            Node newNode=new Node(val);
            if(head==null){
head=newNode;
newNode.prev=null;

            }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=newNode;
            newNode.next=null;
            newNode.prev=temp;
        }}

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
        
    }
}
