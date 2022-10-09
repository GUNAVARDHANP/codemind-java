import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int sq=n*n;
        int r=0;
        while(n>0){
            r=r*10+(n%10);
            n/=10;
        }
        int sqr=r*r;
        int sqrr=0;
        while(sqr>0){
            sqrr=sqrr*10+(sqr%10);
            sqr/=10;
        }
        if(sq==sqrr)
            System.out.print("True");
        else
            System.out.print("False");
    }
}