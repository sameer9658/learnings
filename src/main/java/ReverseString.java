import java.util.ArrayList;
import java.util.List;

/**
 * Created by 609684007 on 4/10/2017.
 */
public class ReverseString {

    public static void main(String[] args){

       int num[]={4537,4321,123,43412};
        ArrayList list = new ArrayList();
        StringBuilder sb = new StringBuilder();
        boolean isTrue =false;
        for(int i=0;i<num.length;i++){

            String str = Integer.toString(num[i]);
            int count = 0;

            if( (str.contains("1") && str.contains("2") && str.contains("3") ))
            {
                if(!sb.toString().isEmpty()) {
                    sb.append(',');
                }
                isTrue=true;
            }
            if(isTrue) {
                isTrue=false;
                sb.append(str);


            }


        }
        System.out.print(sb);

}





































     /*  long startTime = System.nanoTime();
        String string = "Quora Hi";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        System.out.println(stringBuilder.reverse());
        long endTime = System.nanoTime();
        System.out.println("Duration "+(endTime-startTime));*/
    }


