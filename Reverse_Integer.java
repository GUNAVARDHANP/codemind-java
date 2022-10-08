import java.util.*;
class lo{
    static int rev(int n){
        int t=n,rev=0;
        if(t<0)
            t=t*-1;
        while(t>0){
            rev=rev*10+(t%10);
            t/=10;
        }
        if(n<0)
            return rev*-1;
        return rev;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        System.out.println(rev(g.nextInt()));
    }
}