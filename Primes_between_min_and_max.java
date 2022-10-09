import java.util.*;
class lo{
    static boolean prime(int n){
        if(n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),max=0,min=0,ind1=0,ind2=0,c=0;
        int[] a=new int[n];
        a[0]=g.nextInt();
        min=a[0];
        if(max<a[0]){
            max=a[0];
            ind1=0;
        }    
        for(int i=1;i<n;i++){
            a[i]=g.nextInt();
            if(max<a[i]){
                max=a[i];
                ind1=i;
            }
            if(min>a[i]){
                min=a[i];
                ind2=i;
            }
        }
        for(int i=Math.min(ind1,ind2);i<=Math.max(ind1,ind2);i++){
            if(prime(a[i]))
                c+=1;
        }
        System.out.println(c);
    }
}