public class instance {
    int x=5;
    public static void main(String args[]){
        int a[]= new int[5];
        instance x=new instance();
        
        for(int i=0;i<x.x;i++)
        {
            a[i]=i;
        }
        news(a);
        
    }
    public static void news(int a[])
    {
        for(int i:a){
            System.out.println(i);
        }
}
}
