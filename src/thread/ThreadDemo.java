package src.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable thread1=()->{
          //thread body
            for (int i=0; i<=10;i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                     e.printStackTrace();
                }
            }
        };
        Thread t1=new Thread(thread1);
        t1.setName("John");
        t1.start();
    }
}
