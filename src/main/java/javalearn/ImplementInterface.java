package javalearn;

import java.nio.charset.Charset;
import java.util.*;
import java.util.ArrayList;
//вывести цыкл цифр задом на перёд
public class ImplementInterface {
    public static void main(String[] args) {
        //RunImplMethod runImplMethod = new RunImplMethod();
        ImplementInterface implementInterface = new ImplementInterface();


        int [] mas = {1, 5, 10, 6, 8};
        int [] click = new int[5];

        List<String> firstList= new ArrayList<>();
        List<String> secondList = new LinkedList<>();
        List<List<String>> five = new ArrayList<List<String>>();

        List<String> dmo = new ArrayList<String>(Arrays.asList("vbn", "vcx", "qasd", "sss","tttt"));

        HashSet<String> thirdSet = new HashSet<>();

        Map<Integer, String> six = new HashMap<>();



//        String [] vmn = {"Hi", "Hello", "Hello", "Bye", "bye", "hello","fr" ,"gf", "GF", "vb", "Meow", "hi", "Hello", "Meow", "Be", "Bye"};        //charAt находит символ по индексув слове
//        Set<String> uklon = new LinkedHashSet<>();                                                                                   // вывести только уникальные значения
//        for (String somelist: vmn) {
//        if (Character.isUpperCase(somelist.charAt(0))){
//            uklon.add(somelist);
//        }
//        }
//        System.out.println(uklon);
//    }
}}


//        {"Secrets"};//{"BATMAN"}//{"supermaN"}
//        String slovo = "Secret";
//        char[] gel = slovo.toCharArray();
//        for (int i = 0; i < gel.length; i++) {
//            System.out.print("[" + gel[i] + "]");                                       // выводит по буквам
//        }
//        String slovo = "Secret";
//        char[] gel = slovo.toCharArray();
//        for (int i = gel.length-1; i >= 0; i--) {
//            System.out.print("[" + gel[i] + "]");                                       // выводит по буквам задом на перёд
//        }

//        String bukvu1 = "abc";
//        String bukvu2 = "cba";
//        char [] xren = bukvu1.toCharArray();
//        char [] xren2 = bukvu2.toCharArray();
//        Arrays.sort(xren);
//        Arrays.sort(xren2);
//        System.out.println(Arrays.equals(xren, xren2));                     // анаграма проверка что они похожи




//        List<String> testList= new ArrayList<>(Arrays.asList("vbn", "vcx", "qasd", "sss","tttt"));// из лист в масив
//        String[] someWord = new String[testList.size()];
//        for (int i = 0; i < testList.size(); i++) {
//            someWord[i]=testList.get(i);
//        }
        
        
//        Map<Integer,String> road = new HashMap<>();///                                                 из мапы в лист
//        road.put(0, "bn");
//        road.put(1, "ui");
//        road.put(2, "ty");
//        road.put(3, "er");
//        for (Map.Entry entry: road.entrySet()) {
//            List<Map.Entry> carList= new ArrayList<>();
//            carList.add(entry);
//            System.out.println(carList);
//        }


//        List<String> road = new ArrayList<>();///                                                 из лист в мапа
//        road.add("bn");
//        road.add("df");
//        road.add("fg");
//        road.add("cccx");
//        for (int i = 0; i < road.size(); i++) {
//            Map<Integer, String> zoe = new HashMap<>();
//            zoe.put(i,road.get(i));
//            System.out.println(zoe);
//        }






        
        





//    @Override
//    public Map<String, Integer> findUniquesInList(List<String> input_list) {
//        return null;
//    }

//    List<String> blabla = Arrays.asList("first", "second", "third", "five","new", "boring");
//    String [] back = {"first", "second", "third", "five","new", "boring"};
//        for (int i = back.length-1; i>=0; i--) {
//        System.out.println(back[i]);
//    }


//        List<String> bike = Arrays.asList("Hi", "Hello", "Bye", "bye", "Meow", "hi", "Meow", "Be", "yBye");
//        for (int i = bike.size(); i <=0; i--) {
//            System.out.println(bike);
//
//        }

//вывести из листа только те слова в которых есть цыфра/буква/символ или больше какого то условия


//        List<String> blabla = Arrays.asList("car1","car2", "car3", "car4", "car5", "car6");
//        List<String>borabora = new LinkedList<>();
//        for (String x: blabla){
//            if (x.contains("8")) {
//                System.out.println(x + " " + "vuvodim 3 simvol");
//            }else {
//                borabora.add(x);
//                System.out.println(x);
//            }
//        }//если находим что то в слове тогда добавляем или удаляем что то


//        List<String> someList = Arrays.asList("Hi", "Hello", "Bye", "bye","fr", "gf", "vb", "Meow", "hi", "Hello","Meow", "Be", "Bye");
//        Set<String> set = new LinkedHashSet<>();
//        for (String somelis: someList) {
//            if (Character.isUpperCase(somelis.charAt(0))){
//                set.add(somelis);
//            }
//            System.out.println(set);
//        } //выводит уникальыне значения из одного листа в другой ориентируясь только на большые буквы
//        }


//
//        String[] blabla = {"Qwe", "rtyu", "Cvbn"};
//        List<String> someList = new ArrayList<>();
//        for (int i = 0; i < blabla.length; i++) {
//            String someString = blabla[i];
//            if (Character.isUpperCase(someString.charAt(0))){
//                someList.add(someString);
//            }
//        System.out.println(someList + "------");//запихуем масив в лист

//        String[] blabla = {"Qwe", "rtyu", "Cvbn"};
//        List<String> someList = new ArrayList<>();
//        for (String zxcv: blabla) {
//            if (Character.isUpperCase(zxcv.charAt(0))){
//                someList.add(zxcv);
//            }
//            System.out.println(someList);//запихуем масив в лист
//
//        }


//        String slovo = "Windows";
//        char[] nazad = slovo.toCharArray();
//        for (int i = nazad.length -1; i>=0 ; i--) {
//            System.out.print(nazad[i]);
//        }


//        String [] blabla = {"qwe", "rtyu","cvbn"};
//        for (int i = blabla.length-1; i >=0; i--) {
//            String who = blabla[i];
//            char[]bykvu = who.toCharArray();
//            for (int j = 0; j < bykvu.length; j++) {
//                System.out.print("["+bykvu[j]+"]");
//            }
    //System.out.println(who + "-----+++++");

//        System.out.println("+++++++++++++++++++++++++++");
//
//        for (int i = 0; i < blabla.length; i++) {
//            System.out.print("["+blabla[i]+"]");
//        }
//        System.out.println("--------------------------");

//        String slovo = "wiskas";
//        char[] bukvy = slovo.toCharArray();
//        for (int i = bukvy.length-1; i >=0; i--) {
//            System.out.print("[" + bukvy[i] + "]");
//
//        }//слово выводим побуквенно задом на перёд


//    @Override
//    public Map<String, Integer> findUniquesInList(List<String> input_list) {
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
//    }


