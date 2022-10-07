import java.util.*;
class lo{
    static int add(int n){
        int t=n,r=0;
        while(t>0){
            r+=t%10;
            t=t/10;
        }
        return r;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        while(n>9)
            n=add(n);
        System.out.println(n);
    }
}