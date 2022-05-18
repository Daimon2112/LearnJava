public class Multidimension_arrays {
    public static void main(String[] args) {
        int[] number = {1,2,3};
        int[] array = new int[5];
        System.out.println(number[1]);

        int [][] arrayArray = {{1,34,22},{2,45,55},{4,58,99}};
        for (int i = 0; i < arrayArray.length; i++) {
            for (int j = 0; j < arrayArray[i].length; j++) {
                System.out.print(arrayArray[i][j] + " ");
            }
            System.out.println("--------------------------");
        }////// написать метод который будет заполнять многомерный масив по диагонали
       // public void blabla(int[][] array2, int valueForPut)
//        for(int f = arrayArray.length - 1; f>=0; f--){
//            for (int j = 0; j < arrayArray.length; j++){
//                if(f + j == arrayArray.length - 1)
//                    arrayArray[f][j] = valueForPut;
//            }// заполняет по диагонали справа на налево
//        }

        int [][] someArray = new int[3][3];
        System.out.println(someArray[1][1]);

        for(int i = 0; i < someArray.length; i++){
            for (int j = 0; j < someArray.length; j++) {
                someArray[i][j] = 0;
//                someArray[0][0] = 5;
//                someArray[1][1] = 9;
//                someArray[2][2] = 10;

                System.out.print(someArray[i][j] + " ");
            }
            someArray[i][i] = 5;
            System.out.println();
        }

        for (int i = array.length -1 ; i >= 0 ; i--) {//int i = array.lenght; i>0; i--  sout array[i-1]
            System.out.println(array[i]);

        }
    }
}
