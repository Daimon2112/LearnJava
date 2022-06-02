package tarasLectureJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lecture {
    public static void main(String[] args) {
        List ourList;
        ourList = new ArrayList();
        System.out.println(ourList);
        ourList.add("test");
        System.out.println(ourList);
        ourList.add(5);
        System.out.println(ourList);
       // System.out.println(ourList.get(-5));

        System.out.println("------END------");

        ArrayList<String> ourList1 = new ArrayList<String>();
        ourList1.add("test1");
        System.out.println("list" + ourList1);

        List<List<String>> ourListList = new ArrayList<List<String>>();
        ourListList.add(new ArrayList<String>());
        System.out.println(ourListList);
        ourListList.get(0).add("test1");
        ourListList.get(0).add("test21");
        ourListList.add(new ArrayList<String>());
        ourListList.get(1).add("test22");
        ourListList.add(ourList1);
        ourListList.add(ourList1);
        ourList1.add("test3");
        ourListList.add(ourList1);


//        System.out.println(ourListList.get(0));
//        System.out.println(ourListList.get(1)); идуский код

        for (List<String> line: ourListList){// с помощью цикла мы вы водим строки по порядку
            System.out.println(line);
        }

        Map<String, String> ourMap = new HashMap<String, String>();//Map это интерфейс
        ourMap.put("Login", "log");
        ourMap.put("Password", "pass");
        ourMap.put("key", "value");
        System.out.println(ourMap);
        System.out.println(ourMap.get("Password"));


        List<Map<String, String>> ourListMap = new ArrayList<Map<String, String>>();
        ourListMap.add(ourMap);
        System.out.println(ourListMap);
        ourListMap.add(new HashMap<String, String>(ourMap));
        System.out.println(ourListMap);
        ourListMap.get(0).size();
        for (Map map: ourListMap
             ) {
            System.out.println(map.size());
        }











//        List<Integer> list = new ArrayList<Integer>();
//
//        list.add(5);
//        list.add(10);
//        list.add(50);
//
//        System.out.println(list);
//
//        list.set(2, 100);
//
//        System.out.println(list.get(2));
//        System.out.println(list.size());

    }
}
