import java.util.*;
class lo{
    static int fsum(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int a=g.nextInt();
        int b=g.nextInt();
        if(fsum(a)==b && fsum(b)==a)
            System.out.print("Amicable");
        else
            System.out.print("Not Amicable");
    }
}