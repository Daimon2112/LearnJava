public class Forif {
    public static void main(String[] arg) {
//        int a = 15;
//        if (a < 15) {
//            System.out.println("Correct");
//        } else if(a >16){
//            System.out.println("Incorrect");
//        }else {
//            System.out.println("Nothing");
//        }//так же может быть конструкция if а внутри тоже if например
//        age = 18
//        if age >= 18:
//        print("Больше 17")
//        if age > 21:
//        print("Больше 21")
//    else:
//        print("От 18 до 21")

        int b = 3;
        if(b > 10){
            System.out.println("b > 5");
            b++;
            System.out.println(b);
        } else if (b < 10){
            System.out.println("someone");
            b--;
            System.out.println(b);
        }

        System.out.println("polubomu");

        int i = 3;

        switch (i){
            case 1:
                System.out.println("number1");
            case 2:
                System.out.println("number2");
            case 3:
                System.out.println("number3");
            default:
                System.out.println("no number");
        }


//
//        for (int i =0;i<=10;i++){//в первом блоке инициализируется переменная// во втором условии говорится ДО КАКИХ ПОР будет выполнятся цыкл//в третим условии что будет происходить в конце цыкла
//            System.out.println("hello world");
//        }
    }}


//231-245-554
//Настроение пользователя должно улучшатся или ухудшаться в зависимости от того выиграл он или нет.

//Объект пользователя должен уметь сказать, какое у него сейчас настроение (вывести в консоль).

//Объект пользователя должен содержать метод для игры, который в свою очередь должен уметь обрабатывать успешную и не успешную комбинацию, и изменять настроение пользователя.

//Количество попыток (вызовов метода игры в лотерею) = 3















//написать програмку для обмена бабла
//usd = 57
//        euro = 60
//
//        money = int(input("Введите сумму, которую вы хотите обменять: "))
//        currency = int(input("Укажите код валюты (доллары - 400, евро - 401): "))
//
//        if currency == 400:
//        cash = round(money / usd, 2)
//        print("Валюта: доллары США")
//        elif currency == 401:
//        cash = round(money / euro, 2)
//        print("Валюта: евро")
//        else:
//        cash = 0
//        print("Неизвестная валюта")
//
//        print("К получению:", cash)