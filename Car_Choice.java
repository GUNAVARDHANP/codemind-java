import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        for(int i=0;i<n;i++){
            int a=g.nextInt();
            int b=g.nextInt();
            int c=g.nextInt();
            int d=g.nextInt();
            float e=c/(float)a;
            float f=d/(float)b;
            if(e<f){
                System.out.println(-1);
            }
            else if(e>f){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    
    }
}