package Team_Erp.Day_2;

 import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyTask implements Callable<Integer> {
    private int number;

    MyTask(int number) {
        this.number = number;
    }

    public Integer call() throws Exception {
        int result = number * number; 
        System.out.println("Task running for number: " + number + " in " + Thread.currentThread().getName());
        Thread.sleep(1000); 
        return result; 
    }
}

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        Future<Integer> f1 = service.submit(new MyTask(5));
        Future<Integer> f2 = service.submit(new MyTask(10));
        Future<Integer> f3 = service.submit(new MyTask(20));

        System.out.println("Result of Task1 = " + f1.get()); 
        System.out.println("Result of Task2 = " + f2.get());
        System.out.println("Result of Task3 = " + f3.get());

        service.shutdown();
    }
}

    

