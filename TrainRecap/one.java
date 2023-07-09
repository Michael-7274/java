public class one {
    // Public variables
    public String fname = "John";
    public String lname = "Doe";
    public String email = "john@doe.com";
    public int age = 24;
    
    // Public method
    public static int main1() {
        int x = 5; // Local variable x with initial value 5
        //int y=7;
        // The method should have a return statement since its return type is int
        // For demonstration purposes, let's return the value of x
        return x++;
    }
    public static void main(String[] args)
    {
        one obi=new one();
        System.out.println(obi.fname);
    }
}
