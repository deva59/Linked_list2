package Linked_list.Linked_List;

import java.util.LinkedList;

public class Addall_method {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("abc");
        list.add(2);
        list.add("cda");
        list.add("@#kf");
        list.add(5);

        System.out.println(list);

        LinkedList new_list = new LinkedList();

        System.out.println(list);

        new_list.addAll(list);

        new_list.removeAll(list);

        new_list.addFirst(12);

        new_list.addAll(list);

        new_list.addLast("tiger");




        System.out.println(new_list);


    }
}
