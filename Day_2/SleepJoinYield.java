package Team_Erp.Day_2;

public class SleepJoinYield {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("T1: " + i);
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("T2: " + i);
                Thread.yield(); 
            }
        });

        t1.start();
        t1.join(); 
        t2.start();
    }
}

    
