package src.genericexample;

class GenericStudy<T> {
    T container;
    public GenericStudy(T container){
        this.container=container;
    }
    public Object getValue(){
        return this.container;
    }

}
public class GenericExample {
    public static void main(String[] args) {
         GenericStudy<String> box= new GenericStudy<>("passing string ");
        System.out.println(box.getValue());
        box.container="ydhdfds";
        System.out.println(box.getValue());

        GenericStudy<Integer> box1= new GenericStudy<>(234);
        System.out.println(box1.getValue());
    }
}
