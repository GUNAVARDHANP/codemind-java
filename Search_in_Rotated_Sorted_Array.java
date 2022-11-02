import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        int k=g.nextInt();
        int f=-1;
        for(int i=0;i<n && f==-1;i++){
            if(a[i]==k)
                f=i;
        }
        System.out.print(f);
    }
}