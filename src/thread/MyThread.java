package src.thread;

// creating thread using Runnable Interface
public class MyThread implements Runnable{
    @Override
    public void run() {
        //task for thread
        for(int i=1;i<=10;i++){
            System.out.println("value of i is :"+i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        //creating object of MyThread class
        MyThread t1= new MyThread();
        MyThread t2= new MyThread();

        Thread thread1=new Thread(t1);
        thread1.start();

//        Thread thread2=new Thread(t2);
//        thread2.start();
        MyAnotherThread t3=new MyAnotherThread();
        t3.start();
    }
}
