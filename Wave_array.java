import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=g.nextInt();
        }
        for(int i=1;i<n-1;i++){
            if((a[i]>a[i-1] && a[i]>a[i+1]) || (a[i-1]>a[i] && a[i+1]>a[i])){
                c=1;
            }
            else{
                c=0;
                break;
            }
        }
        if(c==1){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}