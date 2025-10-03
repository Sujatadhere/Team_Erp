public class SimpleTryCatchEexeption {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        try {
            int a = 10 / 0;   
            System.out.println("Result: " + a); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Program continues after exception handling...");
    }
}

    

