import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),prod=1,sum=0;
        while(n>0){
            prod*=n%10;
            sum+=n%10;
            n/=10;
        }
        System.out.println(prod-sum);
    }
}