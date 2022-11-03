import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n],b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            b[i]=a[i]*a[i];
        }
        Arrays.sort(b);
        for(int i=0;i<n;i++)
            System.out.print(b[i]+" ");
    }
}