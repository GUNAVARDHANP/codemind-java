import java.util.*;
class lo{
    static int HCF(int a,int b){
        int HCF=0;
        for(int i=Math.min(a,b);i>0;i--){
            if(a%i==0 && b%i==0){
                HCF=i;
                break;
            }
        }
        return HCF;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int a=g.nextInt();
        int b=g.nextInt();
        System.out.println((a*b)/HCF(a,b));
    }
}