package src.exceptionhandling;
//how to create custom exception
class AgeInvalidException extends Exception{
    AgeInvalidException(){
        super("Age is Invalid !");
    }
    AgeInvalidException(String message){
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Started...");
       /* int n1=Integer.parseInt("23");
        int n2=Integer.parseInt("3");  // n2= abc: NumberFormatException
            //n2=0 : ArithemeticException
        System.out.println("We got two numbers");
        int result=n1/n2;
        System.out.println("Division is:"+result);
        System.out.println("Terminated..");*/
        try{
            int n1=Integer.parseInt("23");
            int n2=Integer.parseInt("2");  // n2= abc: NumberFormatException
            //n2=0 : ArithemeticException
            if(n2<10){
                throw new AgeInvalidException();
            }
            System.out.println("We got two numbers");
            int result=n1/n2;
            System.out.println("Division is:"+result);
        }
        catch (AgeInvalidException a){
            System.out.println("Invalid n2");
            System.out.println(a.getMessage());
        }
        catch (ArithmeticException ae){
            System.out.println("N2 cannot be 0 !!");
            System.out.println(ae.getMessage());
        }
        catch (NumberFormatException nfe){
            System.out.println("Invalid numbers");
            System.out.println(nfe.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Terminated..");
    }
}
