import java.util.*;
class lo{
    static String ans(int n){
        int c=0,d=0,temp=n;
        while(temp>0){
            if((temp%10)%2==0)
                c=1;
            else
                d=1;
            temp=temp/10;
        }
        if(c==1 && d==0)
            return "Even";
        else if(c==0 && d==1)
            return "Odd";
        return "Mixed";
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        System.out.print(ans(n));
    }
}