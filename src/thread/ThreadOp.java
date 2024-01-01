package src.thread;
class UserThread extends Thread{
    public void run(){
        System.out.println("this is user defined thread.");
    }
}
public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("Program started..");
        int x=56+34;
        System.out.println("Sum is : "+x);
        Thread t=Thread.currentThread();
        String tname= t.getName();
        System.out.println("Current Running Thread Name : "+tname);
//        t.setName("MyMain");
//        System.out.println(t.getName());
//        try{
//            Thread.sleep(5000);
//        }
//        catch (Exception e){ }
        System.out.println(t.getId());
        System.out.println("_______________________");
        System.out.println("Going to start user defined thread");
        UserThread ut=new UserThread();
        ut.start();

        System.out.println("Program ended..");
    }
}
