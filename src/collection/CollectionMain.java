package src.collection;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        //Type safe collection
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.isEmpty());
        names.add("Ram");
        names.add("Sita");
        names.add("Sankar");
        names.add("Parvati");
        System.out.println(names);
//        System.out.println(names.get(2));
//        names.remove(1);
        names.set(1,"Ram");
        names.add(2,"Shyam");
        System.out.println(names.contains("Ram"));
        System.out.println(names.size());
        System.out.println(names);

        System.out.println(names.isEmpty());
        Collections.sort(names);
        System.out.println(names);
//        names.clear();
        Vector<String> list= new Vector<>();
        list.addAll(names);
        System.out.println("list:"+list);

        ArrayList<String> list1= new ArrayList<>();
        list1.addAll(names);
        System.out.println("list:"+list1);
        System.out.println("_______________________________________________________");

        HashSet<Double> nms=new HashSet<>();
        nms.add(223.45);
        nms.add(223.45);
        nms.add(4.45);
        nms.add(223.45);
        nms.add(45.0);
        System.out.println(nms);
        System.out.println("________________________________________________________");

        TreeSet<Double> tset=new TreeSet<>();
        tset.add(223.45);
        tset.add(223.45);
        tset.add(4.45);
        tset.add(223.45);
        tset.add(45.0);
        System.out.println(tset);

       /* //Un type safe
        LinkedList list= new LinkedList();
        list.add("Sachin");
        list.add(5);
        list.add(true);
        list.add(5.7);
        System.out.println(list);*/
    }
}
