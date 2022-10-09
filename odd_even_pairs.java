import java.util.*;
class lo{
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int n=g.nextInt(),bi=0,ci=0,i;
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];
        for(i=0;i<n;i++){
            a[i]=g.nextInt();
            if(a[i]%2!=0)
                b[bi++]=a[i];
            else
                c[ci++]=a[i];
        }
        for(i=0;i<Math.min(bi,ci);i++){
            System.out.print(b[i]+" ");
            System.out.print(c[i]+" ");
        }
        while(i<bi){
            System.out.print(b[i]+" ");
            i++;
        }
        while(i<ci){
            System.out.print(c[i]+" ");
            i++;
        }
        if(n%2!=0)
            System.out.println(0);
}
}