import java.util.*;

//MAP - это интерфейс описывающий отображения в виде ключ значение
public class Learn_Map {
    public static void main(String[] args) {
        Map<String, String> ourMap = new HashMap<String, String>();
        ourMap.put("Login", "log");
        ourMap.put("Password", "pass");
        ourMap.put("key", "value");
        System.out.println(ourMap);
        System.out.println(ourMap.get("Password"));
        System.out.println("==========================");

        for (Map.Entry entry: ourMap.entrySet()
        ) {
            List<Map.Entry> somenew = new ArrayList<Map.Entry>();
            somenew.add(entry);
            System.out.println(somenew);//готово
        }//данные берутся из мапа и помещаются в список




//        List<Map<String, String>> ourListMap = new ArrayList<Map<String, String>>();
//        ourListMap.add(ourMap);
//        System.out.println(ourListMap);
//        ourListMap.add(new HashMap<String, String>());
//        ourListMap.get(1).put("test", "saw");
//        System.out.println(ourListMap);
//        //ourListMap.get(0).size();
//        for (Map map: ourListMap
//        ) {
//            System.out.println("-------");
//            System.out.println(map.entrySet());
//        }
//    }
//    for (int j = 0; j < arrayArray[i].length; j++) {  подставить вместо Map map как нужна переменная счётчик
//        System.out.print(arrayArray[i][j] + " ");
    }

//    Map<Map<String, Object>, Long> counterData = listBeforeGroup.stream().collect(Collectors.groupingBy(m -> m, Collectors.counting()));
//
//    List<Map<String, Object>> listAfterGroup = new ArrayList<>();
//for (Map<String, Object> m : counterData.keySet()) {
//        Map<String, Object> newMap = new HashMap<>(m);
//        newMap.put("count", counterData.get(m));
//        listAfterGroup.add(newMap);
//    }

//    List<String> blabla = Arrays.asList("first", "second", "third", "five","new", "boring");
//    String [] back = {"first", "second", "third", "five","new", "boring"};
//        for (int i = back.length-1; i>=0; i--) {
//        System.out.println(back[i]);
//
//    }


//    List<Integer> newList = new ArrayList<>();
//
//    List<Integer> cow = new ArrayList<>();
//        newList.add(1);
//        newList.add(2);
//        cow.add(3);
//
//        for (Integer line : newList) {
//        //System.out.println(line);
//        Map<Integer, Integer> blabla = new HashMap<Integer, Integer>();
//        blabla.put(1, line);
//        System.out.println(blabla);
//    }
//        System.out.println("-----------END----------");
//}
//}// ответ рядом образования листа в мапу
}
