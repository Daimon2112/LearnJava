import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.*;

public class Learn_list {
    public static void main(String[] args) {
//        List ourList;
//        ourList = new ArrayList();
//        System.out.println(ourList);
//        ourList.add("test");
//        System.out.println(ourList);
//        ourList.add(5);
//        System.out.println(ourList);
//        // System.out.println(ourList.get(-5));
//
//        System.out.println("------END------");
//
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
//        System.out.println(ourListList.get(1)); //идуский код

        for (List<String> line : ourListList) {// с помощью цикла мы вы водим строки по порядку
            System.out.println(line);
        }

        List<String> plane = Arrays.asList("1", "2");
        //Arrays.asList()?????






        //        System.out.println("------START------");
//        ArrayList<String> ourList1 = new ArrayList<String>();
//        ourList1.add("test1");
//        System.out.println("list" + ourList1);
//
//
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
//        System.out.println("------END------");
//
//
//        LinkedList<Integer> createNew = new LinkedList<Integer>();
//        createNew.add(0, 5);
//        createNew.add(1, 6);
//        createNew.add(2, 7);
//        System.out.println(createNew);
//        createNew.remove(1);
//        System.out.println(createNew);




//        Задача 1
//        Создайте целочисленный список ArrayList и заполните его только положительными элементами.
//
//        Входные данные: в первой строке вводится количество элементов в массиве. Во второй строке вводятся элементы массива.
//
//        Выходные данные: выведите только положительные элементы из последовательности.
//
//        Примеры
//	Входные данные	Выходные данные
//        4
//        2 -4 0 100	2 100

//        int n;
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//        ------------
//        ArrayList<Integer> arr = new ArrayList<Integer>();      решение
//        for(int i=0;i<n;i++) {
//            int a = in.nextInt();
//            if(a>0){
//                arr.add(a);
//            }
//        }
//        --------------
//        for (Integer a: arr)
//        {
//            System.out.print(a+" ");
//        }


        //        Задача2
//        Переберите все значения ArrayList и выведите только положительные элементы.
//
//        Входные данные: в первой строке вводится количество элементов в массиве. Во второй строке вводятся элементы массива.
//
//        Выходные данные: выведите только положительные элементы из последовательности в строку.
//
//        Примеры
//	Входные данные	Выходные данные
//        4
//        2 -4 0 100	2 100

//        int n;
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        for(int i=0;i<n;i++) {
//            int a = in.nextInt();
//            if(a>0){
//                arr.add(a);
//            }
//            ----вставить решение -----
//        }
//        private void printListList(List<List<String>> ourList1){
//            System.out.println("---------");
//            for (List<String> line: ourList1)
//                System.out.println(line);
//        }






//        public List<List<String>> addNewList(List<List<String>> ourList1){
//            ourList1.add(new ArrayList<>());
//            printListList(ourList1);
//            return ourList1;
//        }




    }
    }

