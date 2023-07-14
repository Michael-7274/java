class access { // If i declare this class public ,then the compiler asks me to declare the class in a separate file access.java
 public int a=1;
 private int b=2;
 int c=3;
 protected int d=4;
public void toprint(){
    System.out.println(b);
}
}
public class accessmodifier extends access{
    public static void main(String args[]){
        accessmodifier a= new accessmodifier();
        //System.out.println(a.b); Error generated because of private access modifier
        a.toprint();
    }
}

