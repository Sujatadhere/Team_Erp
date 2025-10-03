
     public class MultipleCatchException {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        try {
            int arr[] = new int[5];
            arr[5] = 10 / 0;   
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e);
        } 
        catch (Exception e) {
            System.out.println("General Exception caught: " + e);
        }
        System.out.println("Program continues after handling exceptions...");
    }
}

    

