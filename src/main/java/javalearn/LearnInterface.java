package javalearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface LearnInterface {
//    public void number1();
//    public void number2();
//    public void number3();
//    public void number4();

    public static void methodNew(){
        System.out.println("blablawiskas is interface");
    };
    public default void methodHer(){
        System.out.println("blablawiskas");
    };

    List<String> bleble = new ArrayList<String>();

}

