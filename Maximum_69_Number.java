import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),k=0;
        int[] a=new int[10];
        while(n>0){
            a[k++]=n%10;
            n/=10;
        }
        for(int i=k-1;i>=0;i--){
            if(a[i]==6){
                a[i]=9;
                break;
            }
        }
        for(int i=k-1;i>=0;i--){
            System.out.printf("%d",a[i]);
        }
    }
}