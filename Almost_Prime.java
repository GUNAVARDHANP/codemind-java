import java.util.*;
class lo{
    static boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        for(int i=0;i<n;i++){
            int a=g.nextInt();
            int c=0;
            for(int j=0;j<a;j++){
                for(int k=0;k<a;k++){
                    if(j!=k){
                        if(prime(j) && prime(k) && j*k==a){
                            c=1;
                            System.out.print("YES
");
                        }
                    }
                }
                if(c==1){
                    break;
                }
            }
            if(c==0){
                System.out.print("NO
");
            }
        }
    }
}