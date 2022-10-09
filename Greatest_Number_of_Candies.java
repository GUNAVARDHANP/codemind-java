import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),max=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            if(max<a[i])
                max=a[i];
        }
        int k=g.nextInt();
        for(int i=0;i<n;i++){
            if((a[i]+k)<max)
                System.out.print("False ");
            else
                System.out.print("True ");
        }
        
    }
}