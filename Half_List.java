import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        for(int i=n-1;i>n-n/2-1;i--)
            System.out.print(a[i]+" ");
        for(int i=0;i<n-n/2;i++)
            System.out.print(a[i]+" ");
    }
}