import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),c=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        for(int i=1;i<n-1;i++){
            if((a[i-1]%2!=0 && a[i+1]%2==0) || (a[i-1]%2==0 && a[i+1]%2!=0))
                c+=1;
        }
        System.out.println(c);
    }
}