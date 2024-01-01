package src.thread;

import java.security.spec.ECField;

public class Company {
    int n;
    boolean f=false;
    //f=false: chance: produce
    //f=true: chance: consumer
    synchronized public void produceItem(int n) throws InterruptedException {
        if(f){
            wait();
        }
        this.n=n;
        System.out.println("Produced : "+this.n);
        f=true;
        notify();

    }
    synchronized public int consumeItem() throws InterruptedException {
        if (!f){
            wait();
        }
        System.out.println("Consumed : "+this.n);
        f=false;
        notify();
        return this.n;
    }

}

class Producer extends Thread{
    Company c;
    Producer(Company c){
        this.c=c;
    }
    public void run(){
        int i=1;
        while (true){

            try{
                this.c.produceItem(i);
                Thread.sleep(1000);  //1000 ms =1 second
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            i++;
        }
    }
}

class Consumer extends Thread{
    Company c;
    Consumer(Company c){
        this.c=c;
    }
    public void run(){
        int i=1;
        while (true){
            try{
                this.c.consumeItem();
                Thread.sleep(2000);  //1000 ms =1 second
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            i++;
        }
    }
}
class Main{
    public static void main(String[] args) {
        Company comp=new Company();
        Producer p=new Producer(comp);
        Consumer c= new Consumer(comp);
        p.start();
        c.start();
    }
}