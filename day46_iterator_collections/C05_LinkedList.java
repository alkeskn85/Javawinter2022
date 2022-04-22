package day46_iterator_collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        //Hem  List, hemde Queue'nun child class'idir
        LinkedList<Integer> list= new LinkedList<>();
        list.add(5);// add method'u Listen geldigi icin hep sona ekler
        list.addFirst(11);//addFirst deque'den gelir
        list.addLast(12);//addLast deque'den gelir

        System.out.println(list);//[11, 5, 12]

        list.add(2,25);// 2. index'se 25 ekle demek

        System.out.println(list);

    }
}
