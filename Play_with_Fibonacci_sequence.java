import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int i=0,s=0,e=1,sum=s+e;
        System.out.printf("%d ",s);
        while(i<n-1){
            i+=1;
            System.out.printf("%d ",sum);
            sum=s+e;
            s=e;
            e=sum;
        }
    }
}