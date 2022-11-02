import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        int m1=-2;
        for(int i=0;i<n;i++){
            if(a[i]>m1)
                m1=a[i];
        }
        int m2=-2;
        for(int i=0;i<n;i++){
            if(a[i]!=m1 && a[i]>m2)
                m2=a[i];
        }
        int m3=-2;
        for(int i=0;i<n;i++){
            if(a[i]!=m1 && a[i]!=m2 && a[i]>m3)
                m3=a[i];
        }
        if(m3==-2 && m2==-2)
            System.out.print(m1);
        else if(m3==-2)
            System.out.print(Math.max(m1,m2));
        else
            System.out.print(m3);
    }
}