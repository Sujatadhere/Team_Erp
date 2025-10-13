public class UncheckedException {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        String[] students = new String[3];
        students[0] = "Sujata";
        students[1] = "Gauri";

        try {
            System.out.println("Length of third student's name: " + students[2].length());
        } 
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }

        System.out.println("Program continues after handling exception...");
    }
}

    

