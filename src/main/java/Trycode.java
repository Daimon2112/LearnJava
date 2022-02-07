import java.util.Scanner;
public class Trycode {
    public static void main(String[] args) {

    int A, B;
    Scanner in = new Scanner(System.in);
    A = in.nextInt();
    B = in.nextInt();
    if (A > B) {
        System.out.println("Maximum "+A);
    }else   {
        System.out.println("Maximum "+B);
    }
}
}
