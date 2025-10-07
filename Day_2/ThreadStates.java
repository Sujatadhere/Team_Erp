package Team_Erp.Day_2;

    class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is RUNNING...");
        try {
            Thread.sleep(1000); 
            synchronized (this) {
                wait(1000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread has FINISHED.");
    }
}

public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();

        System.out.println("State after creation: " + t.getState());
        t.start();
        Thread.sleep(100);
        System.out.println("State after start(): " + t.getState());

        Thread.sleep(800);
        System.out.println("State while sleeping: " + t.getState());

        Thread.sleep(1200);
        System.out.println("State while waiting: " + t.getState());

        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}

