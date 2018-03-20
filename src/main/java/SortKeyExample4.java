import java.util.*;

public class SortKeyExample4 {

    public static void main(String[] args) {
        Map<String,Integer> treemap = new TreeMap<>();
        treemap.put("Samir",12);
        treemap.put("Sachin",43);
        treemap.put("Abhi",9);

        System.out.println("Before Sort ::\n"+treemap);

        List<Map.Entry<String,Integer>> toSort = new ArrayList<Map.Entry<String, Integer>>(treemap.entrySet());
        Collections.sort(toSort, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        System.out.println("After Sort using Key ::\n"+toSort);

        Collections.sort(toSort, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("Before Sort using value::\n"+toSort);
    }
}
