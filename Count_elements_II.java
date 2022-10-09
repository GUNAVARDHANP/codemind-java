import java.util.*;
class lo{
    static boolean not(int[] a,int b,int n){
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==b)
                c=1;
        }
        return c==0;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int m=g.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        for(int i=0;i<m;i++)
            b[i]=g.nextInt();
        int k=0;
        int[] c=new int[n+m];
        for(int i=0;i<n;i++){
            if(not(c,a[i],k)){
                if(not(b,a[i],m))
                    c[k++]=a[i];
            }
        }
        for(int i=0;i<m;i++){
            if(not(c,b[i],k)){
                if(not(a,b[i],n))
                    c[k++]=b[i];
            }
        }
        System.out.println(k);
    }
}