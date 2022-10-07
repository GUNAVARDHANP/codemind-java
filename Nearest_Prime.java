import java.util.*;
class lo{
    static boolean prime(int n){
        if(n<2)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    static int near(int n){
        int a=n,b=n;
        while(prime(a)==false)
            a-=1;
        while(prime(b)==false)
            b+=1;
        if((b-n)<(n-a))
            return b;
         return a;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(near(g.nextInt()));
        }
    }
}