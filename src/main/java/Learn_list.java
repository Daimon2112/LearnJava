import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.*;
// интерфейс - декларативное обьявления что должен наследовать наследник
//отличается от класа тем что нету реализации методов - нету блока реализации
public class Learn_list {
    public static void main(String[] args) {
//        List ourList;
//        ourList = new ArrayList();//динамический список который реализует интерфейс лист
//        //System.out.println(ourList);
//        ourList.add("test");
//        System.out.println(ourList);
//        System.out.println("------1------");
//        ourList.add(5);
//        System.out.println(ourList);
//        System.out.println("------2------");
//        // System.out.println(ourList.get(-5));
//        //ourList.isEmpty();
//        System.out.println("-----------555---------");

//        List<String> bleble = new ArrayList<String>();
//        ArrayList<String> ourList1 = new ArrayList<String>();
//        ourList1.add("test1");
//        System.out.println(ourList1);
//        System.out.println("=======================");
//
//        List<List<String>> ourListList = new ArrayList<List<String>>();
//        ourListList.add(new ArrayList<String>());
//        System.out.println(ourListList);
//        System.out.println("--------------------------------------------");
//        ourListList.get(0).add("test11");
//        ourListList.get(0).add("test12");
//        ourListList.add(new ArrayList<String>());
//        ourListList.get(1).add("test21");
//        ourListList.add(ourList1);
//        ourListList.add(ourList1);
//        ourList1.add("test3");
////        ourListList.add(ourList1);
//        System.out.println(ourListList);
//        System.out.println(ourList1);
//        System.out.println("--------------------------------------------");


//        System.out.println(ourListList.get(0));
//        System.out.println(ourListList.get(1)); //идуский код

//        for (List<String> line : ourListList) {// с помощью цикла мы вы водим строки по порядку// List<String> line -переменная куда записыватся будет//ourListList-откуда будут записывать
//            System.out.println(line);
//        }

//        List<String> blabla = new ArrayList<>();
//        Map<Integer, String> maper = new HashMap<>();
//        blabla.add(0,"firstlist");
//        for (int i = 0; i < blabla.size(); i++) {
//            maper.put(i,blabla.get(i));
//        }
//        System.out.println(maper); // переобразование листа в мапу
//    }

//        int i = 0;
//        List<String> learnlist = new ArrayList<String>();
//        //learnlist.add("blabla");
//        System.out.println(learnlist.size());
//        while (learnlist.size() <= 5){
//            learnlist.add("somenewshit"+ i++);
//            System.out.println(learnlist.size());
//            System.out.println(learnlist);// добавление через цыкл в список данных

        //добавить/применить к списку
//        for(int i=0; i<array2.length; i++){
//            array2[i] = i;
//            System.out.print(array2[i] + ",");//заполняет масив
//        }
//        System.out.println("=================drugoi");



//       List<String> plane = Arrays.asList("1", "2");
//        Arrays.asList()?????


//                System.out.println("------START------");
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
        LinkedList<Integer> createNew = new LinkedList<Integer>();
        createNew.add(0, 5);
        createNew.add(1, 6);
        createNew.add(2, 7);
        createNew.add(8, 7);
        System.out.println(createNew);
        createNew.remove(1);
        System.out.println(createNew);
        createNew.removeFirst();
        System.out.println(createNew);


//        List<WebElement> all = driver.findElements(By.xpath("//div[@data-abe]//b"));
//        for (WebElement some: all){
//            System.out.println(some.getText());
//        } пример того как берётся список елементов а потом через цыкл записуется в другой и выводится текст


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


//    }
//    private void printListList(List<List<String>> ourList1){
//        System.out.println("---------");
//        for (List<String> line: ourList1)
//            System.out.println(line);
//        System.out.println("------------------------------"); //---------------------------------нельзя запустить
//    }

//
//
//
//
//    public List<List<String>> addNewList(List<List<String>> ourList1){//метод лист которые принимает в себя параметр лист
//        ourList1.add(new ArrayList<String>());
//        printListList(ourList1);
//        System.out.println("+++++++++++++++++++++++++++");
//        return ourList1; ----------------------------------------------------------------------нельзя запустить
//    }

//        List<List<String>> addValueToListList(int numberOfList, String value, List<List<String>> ourList1){
//            try {
//                ourList1.get(numberOfList).add(value);
//                printListList(ourList1);
//                return ourList1;
//            }catch (IndexOutOfBoundsException e){
//                printListList(ourList1);
//                System.out.println("для добавления елемента указан");
//                return ourList1;
//            }
//        }

//        List<List<String>> someList(List<List<String>>ourList1){
//            ourList1.add(new ArrayList<String>());
//            System.out.println();
//        }


    }}

