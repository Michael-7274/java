public class newfinalclassaccess {
    public static int m(){
        System.out.println("Executed");
        return 6;

    } 
    public static void main(String args[]){
    newfinalclass x = new newfinalclass();
    System.out.println(x.c);
    int a=m();
}
}

