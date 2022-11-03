import java.util.*;
class lO{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        int m=g.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++)
            b[i]=g.nextInt();
        int k=g.nextInt(),c=0;
        for(int i=0;i<n;i++){
            if(a[i]<=k && b[i]>=k)
                c++;
        }
        System.out.print(c);
    }
}