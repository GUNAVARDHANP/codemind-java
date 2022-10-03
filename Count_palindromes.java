import java.util.*;
class lo{
    static boolean pali(int n){
        int temp=n,rev=0;
        while(temp>0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        return (rev==n);
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
            if(pali(a[i])){
                c+=1;
            }
        }
        System.out.println(c);
    }
}