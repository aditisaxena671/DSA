public class patternCharacter {
    public static void main(String args[]){
        char ch=97;
        // System.out.println(ch);
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
