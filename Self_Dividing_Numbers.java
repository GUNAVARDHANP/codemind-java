import java.util.*;
class lo{
    static boolean selfi(int n){
        int temp=n;
        while(temp>0){
            if(temp%10==0 || n%(temp%10)!=0)
                return false;
            temp=temp/10;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int a=g.nextInt();
        int b=g.nextInt();
        for(int i=a;i<=b;i++){
            if(selfi(i))
                System.out.printf("%d ",i);
        }
    }
}