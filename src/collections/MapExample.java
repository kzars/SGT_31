package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        //Add values to Map
        map.put("Bob",900);
        map.put("John",920);

        //Print out
        System.out.println(map);

        //Get value from key
        System.out.println("John's salary: " + map.get("John"));

        //All key values
        System.out.println(map.keySet());

        //All values in map
        System.out.println(map.values());

        //Size
        System.out.println(map.size());

        //Check if Map contains key
        System.out.println(map.containsKey("Tony"));
        System.out.println(map.containsKey("Bob"));

        //Check if Map contains value
        System.out.println(map.containsValue(1000));
        System.out.println(map.containsValue(920));

        //Remove key/value pair from Map if exists
        System.out.println(map.remove("Bob"));
        System.out.println(map);

        //Example

        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia","Tallinn");
        capitalCity.put("Latvia","Riga");
        capitalCity.put("Lithuania","Vilnius");
        capitalCity.put("Fake Estonia", "Tallinn");

        System.out.println(capitalCity.get("Lithuania"));

        for (Map.Entry<String,String> entry: capitalCity.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //Print out all keys where value is Tallinn
        for (Map.Entry<String,String> entry: capitalCity.entrySet()){
            if(entry.getValue().equals("Tallinn")){
                System.out.println(entry.getKey());
            }
        }



    }
}
