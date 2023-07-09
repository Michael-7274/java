
class two {
    public static void main(String[] args) {
        one myObj = new one(); // Create an instance of the Main class
        
        // Call the main1() method using the instance and assign the returned value to a variable
        int result = myObj.main1();
        
        // Access the value of y through the assigned variable
        int yValue = result - myObj.age;
        
        // Print the value of y
        System.out.println(Math.max(2, 3));
    }
}
