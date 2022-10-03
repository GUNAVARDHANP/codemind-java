import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        float sum=0;
        for(int i=0;i<n;i++){
            sum+=1/(float)(1+i);
        }
        System.out.printf("%.2f",sum);
    }
}