import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.util.*;

public class StudentSortTest {

    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student("Samir", 12, 26);
        student[1] = new Student("Chandan", 15, 29);
        student[2] = new Student("Sachin", 17, 20);


        //Arrays.sort(student,Student.nameComparator);
        // Arrays.sort(student,Student.ageComaparator);
        /*Arrays.sort(student,Student.idComparator);

        System.out.println(Arrays.toString(student));*/
try{
    int[] input = new int[]{1, 9, 3, 7, 7, 8, 1, 9, 9, 10};
    Set set = new HashSet();
    List list = new ArrayList();
    for (int number : input) {
        list.add(number);
    }
    for (int number : input) {
        set.add(number);
    }
    for (Object number : set) {
        System.out.println("Count of :"+number+" is:: "+Collections.frequency(list, number));

    }
return;
}finally {
System.out.println("HII");
}
}
}
