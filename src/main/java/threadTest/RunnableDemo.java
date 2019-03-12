package threadTest;

public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running"+threadName);
        try {
            for (int i = 4;i>0;i--){
                System.out.println("Thread:"+ threadName + i);
                //sleep()是Thread类里的静态方法，可以直接调用
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread:" +  threadName + " interrupted.");
        }
        System.out.println("Thread:"+ threadName +"exiting");
    }

    public void start(){
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

    public static void main(String[] args) {
        RunnableDemo a = new RunnableDemo("Thread1  ");
        a.start();
        RunnableDemo b = new RunnableDemo("Thread2  ");
        b.start();
    }
}
