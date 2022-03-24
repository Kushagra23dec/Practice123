package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapsExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Keivin Hart");
        map.put(2,"Kenny");
        map.put(3,"Tanmay");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsValue("Kenny"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get(3));
        System.out.println(map.remove(3));
        System.out.println(map.values());
        System.out.println(map.compute(1, (key,val)->"Russel Peters"));


        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put(4,"hello");
        linkedMap.put(6,"hola");
        linkedMap.put(9,"arigato");
        linkedMap.put(10,"Hi");

        System.out.println(linkedMap.containsValue("Hi"));
        System.out.println(linkedMap.entrySet());
        System.out.println(linkedMap.get(4));
        linkedMap.put(1,"Tomorrow");
        System.out.println(linkedMap.entrySet());


        TreeMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("aba", "Prem");
        treeMap.put("aaa", "kshitij");
        treeMap.put("aea", "saurab");
        System.out.println(treeMap.entrySet());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.ceilingEntry("aca"));

    }
}
