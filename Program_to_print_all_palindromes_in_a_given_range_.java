import java.util.*;
class lo{
    static int rev(int n){
        int temp=n,rev=0;
        while(temp>0){
            rev=rev*10+(temp%10);
            temp=temp/10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int a=g.nextInt();
        int b=g.nextInt();
        for(int i=a;i<b;i++){
            if(i==rev(i))
                System.out.printf("%d ",i);
        }
    }
}