import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),c=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            if(Math.sqrt(a[i])==(int)Math.sqrt(a[i]))
                c+=a[i];
        }
        System.out.print(c);
    }
}