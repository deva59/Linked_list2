package Linked_list;

import java.util.Iterator;
import java.util.LinkedList;

//Linked List -
public class FirstClass {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();


        System.out.println(ll.isEmpty());//True or False

        System.out.println(ll);


        ll.add(1);
        ll.add('a');
        ll.add('b');
        ll.add(2);
        ll.add(3.2);
        ll.add("cdef");
        ll.add(true);

//        System.out.println(ll);

        // System.out.println(ll.get(3));

        // System.out.println(ll.set(1,'v'));//Replace elemnt

        //   System.out.println(ll.remove(1));

        //   System.out.println(ll.contains(1));

        //   System.out.println(ll.size());

//        for(int i=0;i<ll.size();i++){
//            System.out.println(ll.get(i));
//        }

//        for(Object ele : ll){
//            System.out.println(ele);
//        }


        Iterator obj = ll.iterator();
        while (obj.hasNext()) { // after element present or not (element nanter element present aahe ka nahi).
            System.out.println(obj.next());//next element la push karto

            //  System.out.println(ll);
        }
    }
}




















