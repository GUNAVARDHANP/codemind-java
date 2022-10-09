import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        if(n<2)
        System.out.print("not a prime");
        else{
            int c=1;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.print("not a prime");
                    c=0;
                    break;
                }
            }
            if(c==1)
                System.out.print("prime");
        }
    }
}