package ThreadTest;

public class test1 {
    public static void main(String args[]){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + ".start");
        BThread bt = new BThread();
        AThread at = new AThread(bt);
        try {
            bt.start();
            Thread.sleep(2000);
            at.start();
            at.join();
        }catch (Exception e){
            System.out.println("Exception from main");
        }
        System.out.println(threadName + ".end");
    }
}
