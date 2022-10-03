import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        for(int i=0;i<n;i++){
            int a=g.nextInt();
            int b=g.nextInt();
            int c=0;
            for(int j=a;j<b+1;j++){
                if(j%10==2 || j%10==3 || j%10==9){
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}