import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        for(int i=0;i<n;i++){
            int f=1;
            for(int j=0;j<n;j++){
                if(j!=i)
                    f*=a[j];
            }
            System.out.print(f+" ");
        }
    }
}