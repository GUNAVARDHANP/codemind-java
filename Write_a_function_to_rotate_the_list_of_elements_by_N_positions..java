import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        int k=g.nextInt();
        for(int i=n-(k%n);i<n;i++)
            System.out.print(a[i]+" ");
        for(int i=0;i<n-(k%n);i++)
            System.out.print(a[i]+" ");
    }
}