public class Break_continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 16) {
                break;//моментально выводит из цыкла
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Out of cicle");
    }

    public static void main2(String[] args) {
        for (int i = 0; i <= 16; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println("It not chetnoe number");
        }
    }
}