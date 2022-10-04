import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
        }
        for(int i=0;i<(n-n/2);i++){
            if(i==n-i-1)
                System.out.printf("%d %d",a[i],0);
            else
                System.out.printf("%d %d ",a[i],a[n-i-1]);
        }
    }
}