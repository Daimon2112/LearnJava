import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Learn_Map {
    public static void main(String[] args) {
        Map<String, String> ourMap = new HashMap<String, String>();
        ourMap.put("Login", "log");
        ourMap.put("Password", "pass");
        ourMap.put("key", "value");
        System.out.println(ourMap);
        System.out.println(ourMap.get("Password"));


        List<Map<String, String>> ourListMap = new ArrayList<Map<String, String>>();
        ourListMap.add(ourMap);
        System.out.println(ourListMap);
        ourListMap.add(new HashMap<String, String>(ourMap));
        System.out.println(ourListMap);
        ourListMap.get(0).size();
        for (Map map: ourListMap
        ) {
            System.out.println(map.size());
        }
    }
}
