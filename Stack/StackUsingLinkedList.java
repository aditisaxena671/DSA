package stack;

public class StackUsingLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null; 
        }
    }
    public static class Stack1{
        static Node head=null;

        public static boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }

        public static void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
                newNode.next=head;
                head=newNode;
            
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;

        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            return top;
        }
    }
    public static void main(String args[]){
        Stack1 s1= new Stack1();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());


    }
}
