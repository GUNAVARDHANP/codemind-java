import java.util.*;
class lo{
    static boolean in(int[] a,int n,int b){
        for(int i=0;i<n;i++){
            if(a[i]==b) return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        int k=1;
        while(in(a,n,k)){
            k++;
        }
        System.out.print(k);
    }
}