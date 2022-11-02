import java.util.*;
class lo{
    static boolean in(int i,int[] a,int n){
        for(int j=0;j<n;j++){
            if(a[j]==i) return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),ind=0;
        int[] a=new int[n];
        a[0]=g.nextInt();
        for(int i=1;i<n;i++){
            ind=g.nextInt();
            if(in(ind,a,i)){
                System.out.print(ind);
                break;
            }
            else
                a[i]=ind;
        }
    }
}