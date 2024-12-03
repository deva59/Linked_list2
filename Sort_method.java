package Linked_list;
import  java.util.*;
import java.util.LinkedList;

public class Sort_method {
    public static void main(String[] args) {

        LinkedList<Integer> kk = new LinkedList<Integer>();

        kk.add(1);
        kk.add(5);
        kk.add(4);
        kk.add(8);

//        Collections.sort(kk,Collections.reverseOrder());

        Collections.shuffle(kk);//Randomly Data Prints
        System.out.println(kk);

    }
}
