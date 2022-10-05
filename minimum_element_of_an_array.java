import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),mini=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            if(i>0)
                mini=Math.min(a[i],a[i-1]);
        }
        System.out.println(mini);
    }
}