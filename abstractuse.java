abstract class use { // don't put as public
int a=1;
}
class s extends use{

}
class abstractuse{
    public static void main(String args[]){
        s obj=new s();
        System.out.println(obj.a);
    }
}
