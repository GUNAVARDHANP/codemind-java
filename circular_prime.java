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
    static int rev(int n){
        int t=n,r=0;
        while(t>0){
            r=r*10+(t%10);
            t/=10;
        }
        return r;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        if(prime(n)){
            if(prime(rev(n)))
                System.out.print("circular prime");
            else
                System.out.print("prime but not a circular prime");
        }
        else
            System.out.print("not prime");
    }
}