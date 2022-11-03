import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n],b=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        int k=0,f=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
                f+=1;
            else
                b[k++]=a[i];
        }
        for(int i=0;i<f;i++)
            b[k++]=0;
        for(int i=0;i<n;i++)
            System.out.print(b[i]+" ");
    }
}