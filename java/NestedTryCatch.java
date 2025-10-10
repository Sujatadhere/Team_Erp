public class NestedTryCatch {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        try {
            try {
                int a = 10 / 0;   
            } catch (ArithmeticException e) {
                System.out.println("Inner catch block: " + e);
            }
            int arr[] = new int[5];
            arr[10] = 50;   
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch block: " + e);
        }
        System.out.println("Program continues after nested try-catch...");
    }
}

    

