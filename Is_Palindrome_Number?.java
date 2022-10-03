import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int t=n,rev=0;
        while(t!=0){
            rev=(rev*10)+(t%10);
            t=t/10;
        }
        if(rev==n)
        System.out.println(2);
        else
        System.out.println(1);
    }
}