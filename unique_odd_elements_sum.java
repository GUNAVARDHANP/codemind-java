import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int k=0,c=1;
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
        int sum=0;
        for(int i=0;i<k;i++){
            if(b[i]%2!=0)
                sum+=b[i];
        }
        System.out.println(sum);
}
}