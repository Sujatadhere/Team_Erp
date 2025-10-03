import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("check the no.two digit");
        int num=sc.nextInt();
        if(num>=10 && num<=99){
            if(num%2==0){
                System.out.println("number is even");
            }
            else{
                System.out.println("number is odd");
            }
        }
        else{
            System.out.println("the given no.is not 2 digit no");
        }
        }
        }

    

