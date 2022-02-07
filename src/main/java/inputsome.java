import java.util.Scanner;

public class inputsome {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);// с помощью new мы создаём обьект класса - тоесть есть клас сканер а после нью он становится обьектом класса
        System.out.println("Print some number");
        int x = s.nextInt();
        System.out.println("Print some text");
        String string = s.nextLine();//nextline это читает с клавы одну строчки чегото - определяется пока не нажато ентер
        System.out.println("You enter" + string);
    }
}
