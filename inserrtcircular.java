public class inserrtcircular {
    public static void main(String[] args) {
        inserrtcircular obj=new inserrtcircular();
        obj.insert(5);
        obj.insert(7);
        obj.insert(3);
        obj.display();

    }
    private Node head;
    private Node tail;
    public inserrtcircular(){
        this.head=null;
        this.tail=null;
    }
    class Node{
        int value;
        Node next;
        public Node(int val){
            this.value=val;
            this.next=null;
        }
    }
    public void  insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;

        }
        else{
            tail.next=node;
            node.next=head;
            tail=node;
        }
    }
public void display(){
    Node node=head;
    while(node!=tail){
        System.out.println(node.value);
        node=node.next;
    }
}

    
}
