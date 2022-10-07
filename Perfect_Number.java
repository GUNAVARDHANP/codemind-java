import java.util.*;
class lo{
    static int add(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        if(add(n)==n)
            System.out.print("True");
        else
            System.out.print("False");
    }
}