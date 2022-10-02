import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int a=g.nextInt();
        int b=g.nextInt();
        int c=g.nextInt();
        boolean one=(a>50);
        boolean two=(b>60);
        boolean three=(c>100);
        if(one && two && three){
            System.out.println(10);
        }
        else if(one && two){
            System.out.println(9);
        }
        else if(two && three){
            System.out.println(8);
        }
        else if(one && three){
            System.out.println(7);
        }
        else if(one || two ||three){
            System.out.println(6);
        }
        else{
            System.out.println(5);
        }
    }
}