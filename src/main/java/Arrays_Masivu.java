import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_Masivu {
    public static void main(String[] args) {
        int number = 10;// [10]
//        char character = 'a';
//        String s = "Hello";
//        String s1 = new String("Hello");//предідущая строка и єта идентичны
        int [] numbers = new int [5];  // numbers -> [массив] Ссылочный тип данных//масив с пустыми ячейками - а у же потом помещаем туда данные
        //System.out.println(numbers[0]);
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for (int i = 0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("=================");
        int[] numbers1 = {1,2,3};// заранее знаем числа в масиве - создаём целочисленый масив
        for (int i = 0; i<numbers1.length;i++){
            System.out.println(numbers1[i]);
        }

        System.out.println("================= odin masive");


        int[] array = {2,4,26,7,28,10,9,20,33};
        int[] array2 = new int[11];
        System.out.println(array[2]);

        array2[0] = 5;
        array2[1] = 6;


        for(int i=0; i<array2.length; i++){
            array2[i] = i;
            System.out.print(array2[i] + ",");//заполняет масив
        }
        System.out.println("=================drugoi");

        for (int i = array.length - 1; i>=0; i--){
            System.out.print(array[i] + " ");
        }// выводит задом на перёд

        System.out.println("=================");


        int[][] blet = {{5, 4}, {6, 8}};
        System.out.println(Arrays.deepToString(blet));//быстрый вывод масива


//        String [] blabla = {"qwe", "rtyu","cvbn"};
//        for (int i = blabla.length-1; i >=0; i--) {
//            String who = blabla[i];
//            char[]bykvu = who.toCharArray();
//            for (int j = 0; j < bykvu.length; j++) {
//                System.out.print("["+bykvu[j]+"]");//вывод масивазадом на перёд + разбивка по буквам
//            }

//        String[] blabla = {"Qwe", "rtyu", "Cvbn"};
//        List<String> someList = new ArrayList<>();
//        for (int i = 0; i < blabla.length; i++) {
//            String someString = blabla[i];
//            if (Character.isUpperCase(someString.charAt(0))){
//                someList.add(someString);
//            }
//            System.out.println(someList + "------");//запихуем масив в лист
//
////        String[] blabla = {"Qwe", "rtyu", "Cvbn"};
////        List<String> someList = new ArrayList<>();
////        for (String zxcv: blabla) {
////            if (Character.isUpperCase(zxcv.charAt(0))){
////                someList.add(zxcv);
////            }
////            System.out.println(someList);//запихуем масив в лист
////
////        }

        //        String slovo = "wiskas";
//        char[] bukvy = slovo.toCharArray();
//        for (int i = bukvy.length-1; i >=0; i--) {
//            System.out.print("[" + bukvy[i] + "]");
//
//        }//слово выводим побуквенно задом на перёд



    }







    public void printArray(int[] array, int valueForComparing){
        if (array.length>0){
            for (int index = 0; index < array.length; index++) {

                if (array[index] > valueForComparing) {
                    System.out.println("Елемент[" + index + "]" + array[0] + "biger " + valueForComparing);
                } else if (array[index]  == valueForComparing){
                    System.out.println("Елемент[" + index + "]" + array[0] + "raven" + valueForComparing);
                } else if (array[index] < valueForComparing){
                    System.out.println("Елемент[" + index + "]" + array[0] + "меньше" + valueForComparing);
                }
            }
        }else {
            System.out.println("Error");
        }



}
}
