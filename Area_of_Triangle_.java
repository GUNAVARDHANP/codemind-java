import java.util.*;
class v{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int a=g.nextInt();
        int b=g.nextInt();
        int c=g.nextInt();
        float s=(a+b+c)/(float)2;
        float f=(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",Math.sqrt(f));
    }
}