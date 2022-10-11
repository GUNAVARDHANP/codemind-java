import java.util.*;
class lo{
    static String pali(int n){
        int t=n,r=0;
        while(t>0){
            r=r*10+(t%10);
            t/=10;
        }
        if(r==n)
            return "True";
        return "False";
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        System.out.print(pali(n));
    }
}