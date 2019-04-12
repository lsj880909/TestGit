package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(20.00-11.10);
//        System.out.println(20-11.10);
//
//        ArrayList<Object> objects = new ArrayList<>();
//        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
//        String c = "A";
////        switch (c){
////            case "B":
////                System.out.println("A你好");
//////                break;
////            case "A":
//////                System.out.println("B你好");
//////                break;
////            case "C":
////                System.out.println("ABC你好");
//////                break;
////            case "D":
////                System.out.println("D你好");
////                break;
////
////
////
////        }

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        
        list.forEach(it ->{
            System.out.println(it);
        });

        for (String s : list) {
            
        }

    }
}
