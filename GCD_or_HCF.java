import java.util.*;
class lo{
    static int GCD(int a,int b){
        for(int i=Math.min(a,b);i>0;i--){
            if(a%i==0 && b%i==0)
                return i;
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int a=g.nextInt();
        int b=g.nextInt();
        System.out.println(GCD(a,b));
    }
}