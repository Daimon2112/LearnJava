package javalearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LearnInterface {


    public void first();

    public default void second() {
        int b = 5;
    }



    ArrayList<String > bro = new ArrayList<>();

    ArrayList<String> toyota = null;



//    Map<String, Integer> findUniquesInList(List<String> input_list);
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < input_list.size(); i++) {
//            String unicWord = input_list.get(i);
//            if (!map.containsKey(unicWord)){
//                map.put(unicWord, i);
//            }else {
//                map.remove(unicWord);
//            }
//        }
//        return map;



    List<String> bleble = new ArrayList<String>();
//
//    Map<Integer, String> someMap = new HashMap<>();

}

