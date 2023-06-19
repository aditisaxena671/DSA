package stack;
import java.util.*;

public class DuplicateParenthesis {
    public static boolean duplicateCheck(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=')'){
                s.push(str.charAt(i));
            }
            else{
                int count=0;
                while(!s.isEmpty() && s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count==0){
                    return true;
                }
                else{
                    s.pop();
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str="(((a+b)+(c+d)))";
        System.out.println(duplicateCheck(str));
    }
}
