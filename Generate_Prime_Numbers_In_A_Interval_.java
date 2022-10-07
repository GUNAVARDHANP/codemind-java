import java.util.*;
class lo{
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
        int m=g.nextInt();
        for(int i=n;i<m+1;i++){
            if(prime(i))
                System.out.println(i);
        }
    }
}