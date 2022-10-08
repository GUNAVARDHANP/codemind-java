import java.util.*;
class lo{
    static boolean ispow(int n){
        int t=n;
        while(t%2==0)
            t/=2;
        if(t==1)
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int a=n,b=n;
        while(ispow(a)==false)
            a-=1;
        while(ispow(b)==false)
            b+=1;
        System.out.println(Math.min(n-a,b-n));
    }
}