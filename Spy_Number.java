import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),pr=1,sum=0;
        while(n>0){
            pr*=n%10;
            sum+=n%10;
            n/=10;
        }
        if(pr==sum)
            System.out.print("Spy Number");
        else
            System.out.print("Not Spy Number");
    }
}