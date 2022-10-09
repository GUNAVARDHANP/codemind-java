import java.util.*;
class lo{
    static boolean HCF(int[] a,int b,int n){
        int c=1;
        for(int i=0;i<n;i++){
            if(a[i]%b!=0){
                c=0;
                break;
            }
        }
        return c==1;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),min,sol=0;
        int[] a=new int[n];
        a[0]=g.nextInt();
        min=a[0];
        for(int i=1;i<n;i++){
            a[i]=g.nextInt();
            if(min>a[i])
                min=a[i];
        }
        for(int i=min;i>0;i--){
            if(HCF(a,i,n)){
                sol=i;
                break;
            }
        }
        System.out.print(sol);
    }
}