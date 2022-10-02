import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        char a=g.next().charAt(0);
        if(a=='U' || a=='O' || a=='I' || a=='E' || a=='A' || a=='u' || a=='o' || a=='i' || a=='e' || a=='a'){
            System.out.print("Vowel");
        }
        else{
            System.out.print("Consonant");
        }
    }
}