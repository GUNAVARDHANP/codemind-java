import java.util.*;
class lo{
    static boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<(int)Math.sqrt(n)+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int a=g.nextInt();
        int b=g.nextInt();
        int c=0;
        for(int i=a;i<b+1;i++){
            if(prime(i)){
                c+=1;
            }
        }
        System.out.println(c);
    }
}