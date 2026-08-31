package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("////ArrayList////");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(0,5);
        System.out.println(list);



        System.out.println("////LinkedList////");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
        linkedList.set(0,5);
        System.out.println(linkedList);

        System.out.println("////HashMap////");
        HashMap<String,Integer> langs = new HashMap<>();
        langs.put("Java",8);
        langs.replace("Java",10);
        langs.put("JS",1);
        langs.put("Python",3);
        System.out.println(langs);
        int v = langs.get("Java");
        System.out.println(v);
        System.out.println(langs.keySet());
        System.out.println(langs.values());

        List<String> names =new ArrayList<>();
        names.add("anas");
        names.add("ahmed");
        names.add("desoky");
        names.add("torky");
        System.out.println(names);
        List<String> names2 = names.stream().filter(name -> name.startsWith("a")).collect(Collectors.toList());
        System.out.println(names2);
        names.stream().map(name->name.toUpperCase()).forEach(System.out::println);

    }
}
