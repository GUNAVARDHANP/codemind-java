import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),c=0;
        for(int i=1;i<=n-n/2;i++){
            if(n/i==i+1 || n/i==i-1){
                c=1;
                System.out.print("YES");
                break;
            }
        }
        if(c==0)
            System.out.print("NO");
    }
}