
     public class FinallyExample {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        try {
            int data = 10 / 0;   
            System.out.println("Result: " + data);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } 
        finally {
            System.out.println("Finally block always executes (even if exception occurs).");
        }
        System.out.println("Program continues after try-catch-finally...");
    }
}

    

