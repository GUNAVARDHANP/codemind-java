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
        int min=c+1;
        for(int i=0;i<n;i++){
            if(a[i]>=b && a[i]<=c){
                if(min>a[i])
                    min=a[i];
            }
        }
        if(min==c+1)
        System.out.println(-1);
        else
        System.out.println(min);
    }
}