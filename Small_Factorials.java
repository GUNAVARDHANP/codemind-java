import java.util.*;
class lo{
    static int fact(int n){
        if(n==0)
            return 1;
        return n*(fact(n-1));
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        for(int i=0;i<n;i++){
            int a=g.nextInt();
            System.out.println(fact(a));
        }
    }
}