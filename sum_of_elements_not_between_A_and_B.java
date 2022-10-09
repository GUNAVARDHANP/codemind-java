import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        int b=g.nextInt();
        int c=g.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]<b || a[i]>c)
                sum+=a[i];
        }
        System.out.println(sum);
    }
}