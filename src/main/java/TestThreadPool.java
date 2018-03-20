import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TestThreadPool {

    public static void main(String[] args) {

ExecutorService executorService = Executors.newFixedThreadPool(4);
for(int i=0;i<10;i++){
    Runnable threadPoolConcept = new ThreadPoolConcept("" +i,"Thread"+i);
    executorService.execute(threadPoolConcept);
}executorService.shutdown();
        while (!executorService.isTerminated()) {   }
        System.out.println("Finished");
    }
}
