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
        int n1=g.nextInt();
        int n2=g.nextInt();
        int n3=n1+n2+1;
        while(prime(n3)==false)
            n3+=1;
        System.out.println(n3-n2-n1);
    }
}