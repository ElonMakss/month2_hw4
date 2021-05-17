package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> A = addItems(5);
        printList(A);
        ArrayList<String> B = addItems(5);
        printList(B);
        ArrayList<String> C = sotrList(A, B);
        printList(C);


    }
    public static ArrayList<String> sotrList(ArrayList<String> list1, ArrayList<String> list2){
        Iterator<String> iter = list1.iterator();
        Collections.reverse(list2);
        Iterator<String> iter2 = list2.iterator();
        ArrayList<String> sortList =new ArrayList();

        while (iter.hasNext() && iter2.hasNext()) {
            sortList.add(iter.next());
            sortList.add((iter2.next()));
        }
        return sortList;
    }


    public static void printList(ArrayList<?> list) {
        System.out.println("---------------------");
        Iterator<?> iter = list.iterator();
        int i = 0;
        while (iter.hasNext()) {
            System.out.println(" " + i + "  - " + iter.next());
            i++;
        }

    }

    public static ArrayList<String> addItems(int j) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while (i < j) {
            System.out.println("Введите значение: ");
            list.add(scanner.next());
            i++;
        }
        return list;
    }

}
