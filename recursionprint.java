public class recursionprint {
    public static void main(String args[]){
        int a=100;
        recprint(a);
    }
    public static void recprint(int a){
        if(a>0){

            System.out.println("HEllo World"+" "+(101-a));
            recprint(a-1);

        }
        else{

            System.out.println("Done");

        }
    }
}
