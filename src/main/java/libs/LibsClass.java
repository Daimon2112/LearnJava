package libs;

public class LibsClass {
    public static int sum(int slogan1, int slogan2) {
        int tempResult = slogan1 + slogan2;
        System.out.println("Sum method = " + tempResult);
        return tempResult;
    }

    public int sum(String slogan1, int slogan2) {
        try {
            int tempResult = Integer.parseInt(slogan1) + slogan2;
            System.out.println("Sum method = " + tempResult);
            return tempResult;
        } catch (NumberFormatException e) {//кетчей может быть много и каждом можно писать что поймав определённую ошибку типо NumberFormatException
            System.out.println("Error " + e);
            return 789;
        } catch (Exception e){
            System.out.println("blabla" + e);
            return 777;
        }
    }
}