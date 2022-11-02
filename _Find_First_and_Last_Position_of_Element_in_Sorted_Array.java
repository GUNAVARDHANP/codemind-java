import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        int k=g.nextInt();
        int f=-1,b=-1,fc=0,bc=0;
        for(int i=0;i<n && (fc==0 || bc==0);i++){
            if(a[i]==k){
                if(fc==0){
                    f=i;
                    fc=1;
                }
            }
            if(a[n-i-1]==k){
                if(bc==0){
                    b=n-i-1;
                    bc=1;
                }
            }
        }
        System.out.print(f+" "+b);
    }
}