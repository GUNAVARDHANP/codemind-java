import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),l=0;
        while(n>0){
            if(l<n%10)
                l=n%10;
            n/=10;
        }
        System.out.print(l);
    }
}