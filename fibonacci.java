import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int s=0,e=1,sum=1;
        System.out.print(s+" "+e+" ");
        for(int i=2;i<n;i++){
            sum=s+e;
            System.out.print(sum+" ");
            s=e;
            e=sum;
        }
    }
}