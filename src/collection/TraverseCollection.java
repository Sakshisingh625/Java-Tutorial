package src.collection;

import java.util.*;

public class TraverseCollection {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.isEmpty());
        names.add("Ram");
        names.add("Sita");
        names.add("Sankar");
        names.add("Parvati");
        System.out.println(names);
        //1.) for each loop
        for(String str:names){
            System.out.println(str+"\t"+str.length());
        }
        for(String str:names){
            System.out.print(str+"\t"+str.length()+"\t");
            StringBuffer br=new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("_______________________________________");
        //2.) traversing throw iterator
        Iterator<String> itr=names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("_________________________________________");

        //backward traversal with ListIterator
        ListIterator<String> litr=names.listIterator(names.size());
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }

        //Enumeration= it can be used only with Vector
        Vector vec = new Vector();
        vec.add("John");
        vec.add("Gary");
        vec.add("Susan");
        vec.add("Mike");
        vec.add("Angela");
        Enumeration enumeration = vec.elements();
        System.out.println("The vector elements are:");
        while (enumeration.hasMoreElements()) {
            Object obj = enumeration.nextElement();
            System.out.println(obj);
        }

        System.out.println("____________________________");
        //for each
        names.forEach(e->{
            System.out.println(e);
        });
        TreeSet<String> tset= new TreeSet<>();
        tset.addAll(names);
        tset.forEach(e->{
            System.out.println(e);
        });
    }
}
