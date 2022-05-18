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


        int[] array = {2,4,5,6,7,28,43,51,12};
        int[] array2 = new int[11];

        for (int i= 0; i< array2.length; i=i+1){
            array2[i] = i;
            System.out.print(array2[i]);
        }

        System.out.println("-----------");

        for (int i = array.length - 1; i>=0; i--){
            System.out.print(array[i] + " ");
        }


        System.out.println("---END----");

        libsClass.printArray(array, 12);//вызывает метод из другово класа

    }



}
