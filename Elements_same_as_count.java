import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),k=0,d=0,c;
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            c=1;
            for(int j=0;j<k;j++){
                if(a[i]==b[j]){
                    c=0;
                    break;
                }
            }
            if(c==1)
            b[k++]=a[i];
        }
        for(int i=0;i<k;i++){
            c=0;
            for(int j=0;j<n;j++){
                if(a[j]==b[i])
                c+=1;
            }
            if(b[i]==c){
                d=1;
                System.out.printf("%d ",b[i]);
            }
        }
        if(d==0)
            System.out.println(-1);
    }
}