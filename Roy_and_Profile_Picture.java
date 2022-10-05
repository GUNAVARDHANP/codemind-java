import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int l=g.nextInt();
        int n=g.nextInt();
        for(int i=0;i<n;i++){
            int w=g.nextInt();
            int h=g.nextInt();
            if(w<l || h<l)
                System.out.print("UPLOAD ANOTHER
");
            else if(w>=l && h>=l && w==h)
                System.out.print("ACCEPTED
");
            else if(w>=l && h>=l && w!=h)
                System.out.print("CROP IT
");
        }
    }
}