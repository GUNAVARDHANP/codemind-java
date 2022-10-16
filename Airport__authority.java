import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        int f=g.nextInt(),c=0;
        for(int i=0;i<n;i++){
            if(a[i]>f)
                c+=2;
            else
                c+=1;
        }
        System.out.print(c);
    }
}