package src.thread;

//creating thread using Thread class
public class MyAnotherThread extends Thread{
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println("value of i in another thread is: "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
