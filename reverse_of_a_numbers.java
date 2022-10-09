import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),r=0;
        while(n>0){
            r=r*10+(n%10);
            n/=10;
        }
        System.out.println(r);
    }
}