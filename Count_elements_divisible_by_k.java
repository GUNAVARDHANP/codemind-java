import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int k=g.nextInt();
        int[] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            if(a[i]%k==0){
                c+=1;
            }
        }
        System.out.println(c);
    }
}