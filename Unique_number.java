import java.util.*;
class lo{
    static boolean in(int a,int b){
        int t=b;
        while(t>0){
            if((t%10)==a)
                return true;
            t/=10;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),c=1;
        while(n>0){
            if(in(n%10,n/10)){
                c=0;
                break;
            }
            n/=10;
        }
        if(c==1)
            System.out.print("Unique Number");
        else
            System.out.print("Not Unique Number");
    }
}