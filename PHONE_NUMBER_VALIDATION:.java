import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        long a=g.nextLong();
        if(a<Math.pow(10,10) && a>Math.pow(10,8)){
            if(a/Math.pow(10,8)!=0)
                System.out.print("Valid");
            else
                System.out.print("Invalid");
        }
        else
            System.out.print("Invalid");
    }
}