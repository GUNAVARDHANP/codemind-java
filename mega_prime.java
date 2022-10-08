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
        if(prime(n)){
            int c=1;
            while(n>0){
                if(prime(n%10)==false){
                    c=0;
                    break;
                }
                n/=10;
            }
            if(c==1)
                System.out.print("Mega Prime");
            else
                System.out.print("Not Mega Prime");
        }
        else
            System.out.print("Not Mega Prime");
    }
}