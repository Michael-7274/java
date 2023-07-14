public class constructornew {
    int x;
    char e;
    public constructornew(int a , char b){
        System.out.println("Constructor initiated");
        x=a;
        e=b;
    }
    public static void main(String args[]){
        constructornew obj=new constructornew(10,'a');//passing parameters to a constructor
        System.out.println(obj.x);
        System.out.println(obj.e);
    }
}
