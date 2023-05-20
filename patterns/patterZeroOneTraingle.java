public class patterZeroOneTraingle {
    public static void main(String args[]){
        int num=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                // if(num==0){
                //     num=1;
                // }
                // else{
                //     num=0;
                // }
                // System.out.print(num);
                if(((i+j)%2)==0){
                    System.out.print(1);
                }
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}
