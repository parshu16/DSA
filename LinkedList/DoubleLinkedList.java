package DSA.LinkedList;

public class DoubleLinkedList {
    //Method for converting arr->DoublyLinkedList
    static Node convert2DLL(int[]arr){
    Node head=new Node(arr[0]);
    Node temp=head;
    for(int i=1;i<arr.length;i++){
      Node curr=new Node(arr[i],null,temp);
      temp.next=curr;
      temp=curr;
    }
    return head;
}
//Method for Printing the Elements
static Node print(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data);
        temp=temp.next;
    }
    return head;
}
//Method for deleting head
static Node deletehead(Node head){
    if(head==null||head.next==null) return null;
    Node temp=head;
    head=head.next;
    
    head.back=null;
    temp.next=null;
    return head;
}
//Method for deleting Tail
static Node daleteTail(Node head){
    if(head==null||head.next==null) return null;
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    Node tail=temp.back;
    temp.back=null;
    tail.next=null;
    return head;
}
//Method for deleting Kth element
static Node deleteKthNode(Node head,int k){
    Node temp=head;int count=0;
    while(temp!=null){
        count++;
        if(count==k) break;
        temp=temp.next;
    }
    Node rear=temp.back;
    Node front=temp.next;
    
    if(front==null&&rear==null) return null;
    else if(rear==null){
        Node curr=rear;

        rear=rear.next;
        rear.back=null;
        curr.next=null;
        return head;
    }
    else if(front==null){
        Node curr=front;
        while (curr.next!=null) {
            curr=curr.next;
        }
        Node prev=curr.back;
        prev.next=null;
        curr.back=null;
        return head;
    }
    else{
        rear.next=front;
        front.back=rear;
        temp.next=null;
        temp.back=null;
    }
    return head;
}
    public static void main(String[] args) {
        int[]arr={2,4,1,5,6};
        Node head=convert2DLL(arr);
        //head=deletehead(head);
        //head=daleteTail(head);
        head=deleteKthNode(head, 2);
        print(head);
    }
}
