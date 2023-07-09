
// this approach is similar to the fibonacci series 
public class combination1and2 {
    public static void main(String args[])
    {
        int i=5;//number to be expressed in 1's and 2's
        int x;
        int a[]=new int[i];
        if(i==0)
        System.out.println(0);
        if(i==1)
        System.out.println(1);
        if(i==2)
        System.out.println(2);
        if(i>2)
        {
            a[0]=1;
            a[1]=2;
            for(x=2;x<i;x++)
            {
                a[x]=a[x-1]+a[x-2];
                if(x+1==i){
                    System.out.println(x);
                System.out.println(a[x]);
            }
            }
            //System.out.println(a[x-1]);
        }

        
    }
}
