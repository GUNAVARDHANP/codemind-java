import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        double f=Math.sqrt(n);
        int i=(int) f;
        if(i==f)
            System.out.print("True");
        else
            System.out.print("False");
    }
}