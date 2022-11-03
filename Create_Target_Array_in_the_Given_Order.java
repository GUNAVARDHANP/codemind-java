import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=g.nextInt();
        int m=g.nextInt();
        int[] b=new int[n];
        for(int i=0;i<n;i++)
            b[i]=g.nextInt();
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            l.add(b[i],a[i]);
        for(int i=0;i<n;i++)
            System.out.print(l.get(i)+" ");
    }
}