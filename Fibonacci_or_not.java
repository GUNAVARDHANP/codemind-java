import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int s=0,e=1,sum=0;
        while(sum<n){
            sum=s+e;
            s=e;
            e=sum;
        }
        if(e==n)
            System.out.print("True");
        else
            System.out.print("False");
    }
}