import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {//данная конструкция switch используется когда нужно перебрать кучу условий удобней чем IF
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scanner.nextInt();//nextInt принимает только числа
        switch (age){
            case 0:
                System.out.println("Starting life");
                break;
            case 7:
                System.out.println("Starting school");
                break;
            case 18:
                System.out.println("end school");
                break;
            default:
                System.out.println("выполняется в том случаи когда предыдущие условия не работают");
        }
    }
}
