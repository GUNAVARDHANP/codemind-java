import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int m=n*n,sum=0;
        while(m>0){
            sum+=m%10;
            m/=10;
        }
        if(sum==n)
        System.out.print("Neon Number");
        else
        System.out.print("Not Neon Number");
    }
}