import java.util.*;
class lo{
    static String pali(int n){
        int t=n,rev=0;
        while(t>0){
            rev=rev*10+(t%10);
            t/=10;
        }
        if(rev==n)
            return "True";
        return "False";
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(pali(g.nextInt())+"
");
        }
    }
}