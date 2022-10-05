import java.util.*;
class lo{
    static int rev(int n){
        int temp=n,rev=0;
        while(temp>0){
            rev=rev*10+(temp%10);
            temp=temp/10;
        }
        return rev;
    }
    static boolean prime(int n){
        if(n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int i=n+1;
        while(i!=rev(i) || prime(i)==false)
            i=i+1;
        System.out.println(i);
    }
}