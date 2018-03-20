
public class ThreadPoolConcept implements Runnable{

    String messages;
    String name;

    public ThreadPoolConcept(String messages,String name) {
        this.messages = messages;
        this.name = name;
    }

    public void run(){
        Thread.currentThread().setName(name);
        System.out.println(Thread.currentThread().getName()+"(Start messages:=)"+messages);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"(END messages:=)"+messages);
    }

}
