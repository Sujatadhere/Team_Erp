
    import java.io.*;
 class CheckedException{  
    public static void main(String[] args) {
        System.out.println("Program starts...");
        try {
            FileReader fr = new FileReader("student_marks.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Student Record: " + line);
            }
            br.close();  
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } 
        catch (IOException e) {
            System.out.println("IO Exception occurred: " + e);
        }
        System.out.println("Program continues after exception handling...");
    }
}
