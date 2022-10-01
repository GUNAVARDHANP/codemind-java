import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int a=g.nextInt();
        if(a==1 || a==11 || a==12){
            System.out.print("Winter");
        }
        else if(a==2 || a==3){
            System.out.print("Spring");
        }
        else if(a==4 || a==5 || a==6){
            System.out.print("Summer");
        }
        else if(a==7 || a==8 || a==9 || a==10){
            System.out.print("Rainy");
        }
        else{
            System.out.print("-1");
        }
    }
}