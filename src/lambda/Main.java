package src.lambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("My system starts...");

        //1.) Create separate class and implements MyInterface
//        MyInterface myInterface= new MyInterfaceImp();
//        myInterface.sayHello();

        //2.) Anonymous class for implementing interface
//        MyInterface mi=new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("Saying hello from anonymous class..");
//            }
//        };
//        mi.sayHello();

        //3.) Using functional interface with lambda
        MyInterface i=()->{
            System.out.println("Saying hello from lambda..");
        };
        i.sayHello();

        SumInterface si=(int a,int b)->{
            return a + b;
        };
        System.out.println(si.sum(3,4));

        SumInterface si1=( a, b)->( a + b);
        System.out.println(si.sum(3,4));

        StringLength sl=str->str.length();
        System.out.println(sl.strLength("dhhehfhfbdjsbh"));
    }
}
