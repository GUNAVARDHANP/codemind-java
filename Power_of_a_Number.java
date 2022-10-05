import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int x=g.nextInt();
        int y=g.nextInt();
        int m=g.nextInt();
        System.out.println((int)(Math.pow(x,y))%m);
    }
}