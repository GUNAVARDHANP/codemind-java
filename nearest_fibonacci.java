import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),s=0,e=1,sum=0;
        while(sum<n){
            sum=s+e;
            s=e;
            e=sum;
        }
        if((n-s)<(e-n))
            System.out.println(s);
        else if((e-n)<(n-s))
            System.out.println(e);
        else
            System.out.printf("%d %d",s,e);
    }
}