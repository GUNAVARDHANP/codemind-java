import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),k=0,c=0;
        int[] a=new int[n],b=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==1)
                c++;
            else{
                if(c>0)
                    b[k++]=c;
                c=0;
            }
        }
        if(c>0)
            b[k++]=c;
        int m=0;
        for(int i=0;i<k;i++){
            if(b[i]>m)
                m=b[i];
        }
        System.out.print(m);
    }
}