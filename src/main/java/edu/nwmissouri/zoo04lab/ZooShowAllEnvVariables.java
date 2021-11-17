package edu.nwmissouri.zoo04lab;

import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.Map.Entry.comparingByKey;
import java.util.SortedMap;
import static java.util.stream.Collectors.toMap;

/**
 *
 * @author Denise Case
 */
public class ZooShowAllEnvVariables {

    public static void main(String[] args) {
        Map<String, String> map = System.getenv();

        // let's sort this map by keys first 
        Map<String, String> sortedMap = map
                .entrySet()
                .stream()
                .sorted(comparingByKey())
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e2, LinkedHashMap::new)
                );

        sortedMap.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
