import java.util.HashMap;
import java.util.Map;


public class StringReverse {

    public String reverse(String str)
    {
        if ((str==null)||(str.length() <= 1) ){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();
        StringReverse obj=new StringReverse();
        String str = "Quora HI";
        System.out.println("Reverse of \'"+str+"\' is \'"+obj.reverse(str)+"\'");
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

}
