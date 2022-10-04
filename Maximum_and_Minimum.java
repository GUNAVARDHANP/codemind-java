import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),k=0;
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j])
                c+=1;
            }
            if(a[i]==c)
            b[k++]=a[i];
        }
        if(k==0)
        System.out.println(-1);
        else{
            int maxi=0,mini=b[0];
            for(int i=0;i<k;i++){
                if(mini>b[i])
                mini=b[i];
                if(maxi<b[i])
                maxi=b[i];
            }
            System.out.printf("%d %d",mini,maxi);
        }
    }
}