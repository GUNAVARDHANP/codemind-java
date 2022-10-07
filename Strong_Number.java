import java.util.*;
class lo{
    static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),sum=0;
        int t=n;
        while(n>0){
            sum+=fact(n%10);
            n/=10;
        }
        if(sum==t)
            System.out.printf("The number %d is a strong number",t);
        else
            System.out.printf("The number %d is not a strong number",t);
    }
}