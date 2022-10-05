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
        sum=sum/n;
        for(int i=0;i<n;i++){
            if(a[i]==sum){
                System.out.print("True");
                c=1;
                break;
            }
        }
        if(c==0)
            System.out.print("False");
    }
}