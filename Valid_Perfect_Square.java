import java.util.*;
class lo{
    static String isvps(int n){
        for(int i=1;i*i<=n;i++){
            if((n%i==0)&&(n/i==i))
                return "True";
        }
        return "False";
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(isvps(g.nextInt())+"
");
        }
    }
}