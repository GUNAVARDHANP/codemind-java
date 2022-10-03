import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<i+1;j++){
                System.out.printf("%d",j);
            }
            System.out.printf("
");
        }
    }
}