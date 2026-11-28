package DSA.LinkedList;

public class Node {
    int data;
    Node next;
    Node back;
    //Loading and Initializing the Node
    Node(int data,Node next,Node back){
        this.data=data;
        this.next=next;
        this.back=back;
    }
    //constructor for only data
    Node(int data){
        this.data=data;
        this.back=null;
        this.next=null;
    }
}