package stack;

import java.util.Stack;

public class ReverseAStack {
    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        reverseStack(st);
        PushAtBottom(st,top);
    }
    public static void PushAtBottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top=st.pop();
        PushAtBottom(st, data);
        st.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        reverseStack(st);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
