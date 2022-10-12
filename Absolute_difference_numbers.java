import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int d=g.nextInt();
        int a=n%((int)Math.pow(10,d));
        int b=n;
        while(b>(int)Math.pow(10,d)){
            b/=10;
        }
        System.out.print(Math.max(a,b)-Math.min(a,b));
    }
}