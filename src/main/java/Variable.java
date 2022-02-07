public class Variable {
    public static void main(String [] args){
        int myInt; //хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        myInt = 557;//32 бита
        System.out.println(myInt);
    }
    byte b = 0; // -128 - +128
    short a = 3266;//16 бит -32000 - +32000
    long c = 26246246;//64бит
    double d = 235.35;
    float e = 2362.4f;
    char f = 't';//символы
    boolean g = true;//false

}
//При необходимости можно и не переводить курсор на следующую строку. В этом случае можно использовать метод System.out.print(),
// который аналогичен println за тем исключением, что не осуществляет перевода на следующую строку.

