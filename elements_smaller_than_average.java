import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),sum=0,c=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            sum+=a[i];
        }
        for(int i=0;i<n;i++){
            if(a[i]<=sum/n)
               c+=1;
        }
        System.out.println(c);
    }
}