class ThrowExample {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        System.out.println("Program starts...");
        checkAge(15);
        System.out.println("Program continues...");
    }
}
