import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int a=g.nextInt();
        String b="";
        if(a%3==0){
            b+="Pling";
        }
        if(a%5==0){
            b+="Plang";
        }
        if(a%7==0){
            b+="Plong";
        }
        if(b==""){
            System.out.println(a);
        }
        else{
            System.out.print(b);
        }
    }
}