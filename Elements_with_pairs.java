import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            System.out.printf("%d ",a[i]);
        }
        if(n%2!=0)
            System.out.println(0);
    }
}