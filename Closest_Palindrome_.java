import java.util.*;
class lo{
    static boolean pali(int n){
        int t=n,r=0;
        while(t>0){
            r=r*10+(t%10);
            t/=10;
        }
        return r==n;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),a=n-1,b=n+1;
        while(!pali(a))
            a-=1;
        while(!pali(b))
            b+=1;
        if((n-a)<(b-n))
            System.out.print(a);
        else if((b-n)<(n-a))
            System.out.print(b);
        else
            System.out.print(a+" "+b);
    }
}