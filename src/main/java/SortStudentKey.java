import java.util.*;

public class SortStudentKey {

    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        map.put(new Student("Samir", 12, 26),"Student1");
        map.put(new Student("Chandan", 15, 29),"Student2");
        map.put(new Student("Sachin", 17, 20),"Student3");

        System.out.println("Before Sort ::\t"+map);
        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println("ITR ::\t"+itr.next());
        }

        printMap(map);

        List<Map.Entry<Student,String>> toSort = new LinkedList<Map.Entry<Student, String>>(map.entrySet());

        Collections.sort(toSort, new Comparator<Map.Entry<Student, String>>() {
            @Override
            public int compare(Map.Entry<Student, String> o1, Map.Entry<Student, String> o2) {
                return o1.getKey().getName().compareTo(o2.getKey().getName());
            }
        });
        System.out.println("After Sort Sort ::\t"+toSort);



    }
    private static <K,v> void printMap(Map<K,v> mapEntry){
        for(Map.Entry<K,v> entry : mapEntry.entrySet()){

            System.out.println(entry.getKey()+"::"+entry.getValue());
        }
    }

}
