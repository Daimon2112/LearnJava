package javalearn;

import java.util.*;

public class ImplementInterface {
    public static void main(String[] args) {

        List<String> blabla = Arrays.asList("first", "second", "third", "five","new", "boring");
        String [] back = {"first", "second", "third", "five","new", "boring"};
        for (int i = back.length-1; i>=0; i--) {
            System.out.println(back[i]);
            
        }
        
        List<String> milk = new ArrayList<>();

//        for (int i = 0; i < blabla.size(); i++) {
//            String some = blabla.get(i);
//            if (!milk.contains(some)){
//                blabla.add(some);
//                
//            }
//        }



        List<String> borabora = new ArrayList<>();
        borabora.add("first");
        borabora.add("second");
        borabora.add("third");
        borabora.add("five");
        borabora.add("new");
        borabora.add("boring");







    }

}




