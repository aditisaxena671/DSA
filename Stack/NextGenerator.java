package stack;
import java.util.*;
public class NextGenerator{
    public static void main(String args[]){
        int arr[]={1,3,2,4};
        int ans[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=arr[s.peek()];
            }
            s.push(i);
        }


        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}