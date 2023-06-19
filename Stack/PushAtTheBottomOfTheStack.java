package stack;

import java.util.Stack;

public class PushAtTheBottomOfTheStack {
    public static void main(String args[]){
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        PushAtBottom(st, 4);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
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
}
