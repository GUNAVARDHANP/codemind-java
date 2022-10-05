import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),sum=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            sum+=a[i];
        }
        System.out.printf("%.2f",sum/(float)n);
    }
}