import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),h=0,c,d=0;
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            c=1;
            for(int j=0;j<h;j++){
                if(a[i]==b[j]){
                    c=0;
                    break;
                }
            }
            if(c==1)
                b[h++]=a[i];
        }
        int k=g.nextInt();
        for(int i=0;i<h;i++){
            c=0;
            for(int j=0;j<n;j++){
                if(a[j]==b[i])
                c+=1;
            }    
            if(c==k){
                d=1;
                System.out.printf("%d ",b[i]);
            }
        }
        if(d==0)
            System.out.println(-1);
    }
}