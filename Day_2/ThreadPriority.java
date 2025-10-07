package Team_Erp.Day_2;

    class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " running with priority " + getPriority());
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Thread-LOW");
        PriorityThread t2 = new PriorityThread("Thread-NORM");
        PriorityThread t3 = new PriorityThread("Thread-HIGH");

        t1.setPriority(Thread.MIN_PRIORITY);  
        t2.setPriority(Thread.NORM_PRIORITY); 
        t3.setPriority(Thread.MAX_PRIORITY);  


        t1.start();
        t2.start();
        t3.start();
    }
}

