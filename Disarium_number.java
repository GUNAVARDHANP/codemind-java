import java.util.*;
class lo{
    static String find(int n){
        int t=n,i=Integer.toString(t).length(),r=0;
        while(t>0){
            r+=Math.pow(t%10,i);
            i-=1;
            t/=10;
        }
        if(r==n)
            return "True";
        return "False";
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        System.out.print(find(n));
    }
}