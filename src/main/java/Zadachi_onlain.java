import java.util.Scanner;

public class Zadachi_onlain {
    //Необходимо вывести на экран числа от 1 до 5. На экране должно быть: 1 2 3 4 5
    //
    //
//    public static void main(String[] args) {
//        for (int i=1; i<=5; i++){
//            System.out.print(i + " ");
//        }


//Написать програму которая выводит информацию о себе
//    public static void main(String[] args) {
//        String username = "Dmitry";
//        int yearsOld = 28;
//        String workPosition = "AQA";
//        double workExperiance = 0.8;
//        String companyName = "ItrexGroup";
//
//        System.out.print(username + " " + yearsOld + " " + workExperiance);

    //Необходимо вывести на экран таблицу умножения на 3:
//       public static void main(String[] args) {
//           for (int i=1; i<=10; i++){
//               System.out.println(3 * i);
//           }

//Написать програму которая увеличивает вам зарплату каждый месяц на 1000$ используя циклы while/do...while, for(все 3 реализации)
    public static void main(String[] args) {
        int i = 1;
        do {
            int b = i * 1000;
            int c = i + b;
            System.out.println("Зарплата за " + i + " Месяц : " + "= " + b);
            i++;

        }while (i <=12);
        System.out.println("Конец первого");

    }
}

