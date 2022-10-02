import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            c+=a[i];
        }
        System.out.println(c);
    }
}