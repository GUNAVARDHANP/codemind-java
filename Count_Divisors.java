import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int l=g.nextInt();
        int r=g.nextInt();
        int k=g.nextInt(),c=0;
        for(int i=l;i<r+1;i++){
            if(i%k==0)
                c+=1;
        }
        System.out.println(c);
    }
}