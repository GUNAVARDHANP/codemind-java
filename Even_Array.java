import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),c=1;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            if(a[i]%2!=0){
                System.out.print("False");
                c=0;
                break;
            }
        }
        if(c==1)
            System.out.print("True");
    }
}