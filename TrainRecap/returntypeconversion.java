public class returntypeconversion {
    static float plusMethodDouble(double x, double y) {
        return (float)x + (float)y;// type conversion from double to float on return
      }
      public static void main(String args[]){
System.out.println(plusMethodDouble(10.0,11));
      }
    
}
