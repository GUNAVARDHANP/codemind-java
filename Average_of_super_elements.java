import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),k=0,c,sum=0,d=0;
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            c=1;
            for(int j=0;j<k;j++){
                if(a[i]==b[j])
                c=0;
            }
            if(c==1)
            b[k++]=a[i];
        }
        for(int i=0;i<k;i++){
            c=0;
            for(int j=0;j<n;j++){
                if(b[i]==a[j])
                c+=1;
            }
            if(b[i]==c){
                sum+=b[i];
                d+=1;
            }
        }
        if(sum==0)
        System.out.println(-1);
        else
        System.out.printf("%.2f",sum/(float)d);
    }
}