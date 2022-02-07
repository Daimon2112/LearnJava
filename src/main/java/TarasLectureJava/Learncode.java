package TarasLectureJava;

import org.apache.logging.log4j.LogManager;
import reporting.Logger;

public class Learncode {
    public static void main(String[] args) {
        Logger.error("something");

//        System.out.println("------MY CODE------");
//
//        ArrayList<String> learnist = new ArrayList<String>();
//        learnist.add("1");
//        learnist.add("2");
//        learnist.add("3");
//        learnist.add("4");
//        learnist.add("5");
//        learnist.add(5, "information");
//        System.out.println(learnist);
//
//
//        System.out.println("------END------");





//        System.out.println("------START------");
//        ArrayList<String> ourList1 = new ArrayList<String>();
//        ourList1.add("test1");
//        System.out.println("list" + ourList1);
//
//
//        List<List<String>> ourListList = new ArrayList<List<String>>();
//        ourListList.add(new ArrayList<String>());
//        System.out.println(ourListList);
//        ourListList.get(0).add("test1");
//        ourListList.get(0).add("test21");
//        ourListList.add(new ArrayList<String>());
//        ourListList.get(1).add("test22");
//        ourListList.add(ourList1);
//        ourListList.add(ourList1);
//        ourList1.add("test3");
//        ourListList.add(ourList1);
//        System.out.println(ourListList.get(0));
//        System.out.println(ourListList.get(1)); //идуский код
//
//        for (List<String> line: ourListList){// с помощью цикла мы вы водим строки по порядку
//            System.out.println(line);
//        }vhod 4
//              2 -4 0 100   vuh 2 100

//        int n;
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        for(int i=0;i<n;i++) {
//            int a = in.nextInt();
//            arr.add(a);
//            System.out.println(a + "gth");
//        }
//        System.out.println(arr);
//        for (Integer a: arr){
//            if (a>0){
//                System.out.println(arr + "blbla");
//            }
//        }


//        Map<String, String> ourMap = new HashMap<String, String>();//Map это интерфейс
//        ourMap.put("Login", "log");
//        ourMap.put("Password", "pass");
//        ourMap.put("key", "value");
//        System.out.println(ourMap);
//        System.out.println(ourMap.get("Password"));
//
//
//        List<Map<String, String>> ourListMap = new ArrayList<Map<String, String>>();
//        ourListMap.add(ourMap);
//        System.out.println(ourListMap);
//        ourListMap.add(new HashMap<String, String>(ourMap));
//        System.out.println(ourListMap);
//        ourListMap.get(0).size();
//        for (Map map: ourListMap
//        ) {
//            System.out.println(map.size());
//        }
//    }


        Dollar dollar = new Dollar(10);
        System.out.println(dollar.getKursNBU());
        dollar.setKursNBU(15);
        System.out.println(dollar.getKursNBU());
        dollar.convertGrnToCurrency(1000);
        dollar.convertCurrencyToGrn(100);
        dollar.setKursNBU(28);
        dollar.convertCurrencyToGrn(100);

        Euro euro = new Euro(32);
        euro.convertCurrencyToGrn(1000);

        System.out.println("-----END-----");

















}}
