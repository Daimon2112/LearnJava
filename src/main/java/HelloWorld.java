import libs.LibsClass;

import static libs.LibsClass.sum;

public class HelloWorld {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 10;
        int rez;
        rez = var1 + var2;
        System.out.println("result = " + rez);
        int rezult = sum(100, 200);

        LibsClass libsClass = new LibsClass();
        libsClass.sum("8888", 99);

        libsClass.sum("88b8", 99);

        System.out.println("---END----");
    }
}
