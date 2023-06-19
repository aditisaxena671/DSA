package stack;

import java.util.Stack;

public class ReverseAStringUsingStack {
    public static void main(String args[]){
        String str="abcd";
        Stack<Character> ch= new Stack<>();
        for(int i=0;i<str.length();i++){
            ch.push(str.charAt(i));
        }
        StringBuilder result= new StringBuilder();
        while(!ch.isEmpty()){
            result.append(ch.pop());
        }
        str=result.toString();
        System.out.println(str);
    }
}
