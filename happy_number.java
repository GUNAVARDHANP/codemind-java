import java.util.*;
class lo{
    static int sol(int n){
        int sum=0;
        while(n>0){
            sum+=(n%10)*(n%10);
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        while(n>9)
            n=sol(n);
        if(n==1 || n==7)
            System.out.print("True");
        else
            System.out.print("False");
    }
}