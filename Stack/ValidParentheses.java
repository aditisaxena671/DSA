package stack;
import java.util.*;
public class ValidParentheses {
    public static void main(String args[]){
        Stack<Character> s= new Stack<>();
        String str="{[()]}";
        int flag=0;
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='{' || ch=='(' || ch=='['){
                s.push(ch);
            }
            else{
                if(s.isEmpty() || ch=='}' && s.peek()!='{' || ch==')' && s.peek()!='(' || ch==']' && s.peek()!='['){
                    flag=1;
                    break;
                }
                else{
                    s.pop();
                }
            }
        }
        if(s.isEmpty() && flag==0){
            System.out.println("is a valid parentheses");
        }
        else{
            System.out.println("not a valid parentheses");
        }
    }
}
