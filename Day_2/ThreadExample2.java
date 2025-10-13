package Team_Erp.Day_2;

    class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Worker-1");
        Thread t2 = new Thread(new MyRunnable(), "Worker-2");

        t1.start();
        t2.start();
    }
}

    
