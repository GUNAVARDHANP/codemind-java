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
        int n=g.nextInt(),c=0;
        if(n%2==0){
            if(prime(n/2))
                System.out.print(2+" "+n/2);
        }
        else{
            for(int i=3;i<=n/2;i++){
                if(n%i==0){
                    if(prime(i) && prime(n/i)){
                        c=1;
                        System.out.print(i+" "+n/i);
                        break;
                    }
                }
            }
            if(c==0)
                System.out.println(-1);
        }
    }
}