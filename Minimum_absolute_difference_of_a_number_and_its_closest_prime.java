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
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int a=n,b=n;
        while(prime(a)==false)
            a-=1;
        while(prime(b)==false)
            b+=1;
        System.out.println(Math.min(n-a,b-n));
    }
}