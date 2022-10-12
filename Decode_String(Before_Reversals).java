import java.util.*;
class lo{
    static String rev(String a){
        char[] c=a.toCharArray();
        String ans="";
        for(int i=c.length-1;i>-1;i--)
            ans+=c[i];
        return ans;
    }
    static String answer(String a,int n){
        String ans=a;
        for(int i=n;i>1;i--){
            String a1=ans.substring(0,i);
            String a2=ans.substring(i);
            ans=rev(a1)+a2;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int m=g.nextInt();
        for(int j=0;j<m;j++){
            int n=g.nextInt();
            int a=g.nextInt();
            g.nextLine();
            String s=g.nextLine();
            System.out.print(answer(s,a)+"
");
        }
    }
}