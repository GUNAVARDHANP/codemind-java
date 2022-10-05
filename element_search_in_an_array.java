import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),c=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        int k=g.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==k){
                System.out.print("True");
                c=1;
                break;
            }
        }
        if(c==0)
            System.out.print("False");
    }
}