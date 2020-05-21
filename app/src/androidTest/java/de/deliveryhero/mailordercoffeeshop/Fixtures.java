package de.deliveryhero.mailordercoffeeshop;

import java.util.HashMap;

public class Fixtures {

    public static HashMap<String, Object> order(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("espresso", 2);
        map.put("hot", false);
        map.put("chocolate", true);
        map.put("milk selection", "Low fat");
        map.put("milk type", "Steamed");
        return map;
    }
}
