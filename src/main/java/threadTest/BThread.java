package threadTest;

public class BThread extends Thread {
    public BThread(){
        super("[BThread] thread");//调用父类有参构造方法
    }
    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + ".start");
        try {
            for (int i =0;i<5;i++){
                System.out.println(threadName + " loop at " + i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println("exception from " + threadName + ".run" );
        }
    }

}
