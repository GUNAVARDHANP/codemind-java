import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
        }
        int b=g.nextInt();
        int c=g.nextInt();
        int d=0;
        for(int i=0;i<n;i++){
            if(a[i]>=b && a[i]<=c){
                System.out.printf("%d ",a[i]);
                d=1;
            }
        }
        if(d==0)
        System.out.println(-1);
    }
}