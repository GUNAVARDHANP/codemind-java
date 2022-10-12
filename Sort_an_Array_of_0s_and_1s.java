import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),j=0,k=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        Arrays.sort(a);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}