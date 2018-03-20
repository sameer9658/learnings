import java.io.*;
import java.util.*;

public class FileReadAndWritePractice {

    public void readAndWrite(String fileName) throws IOException {
        String line;
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("temp1.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        List listOfStrings = new ArrayList();
        Set setOfNonRepeatedString = new HashSet();
        while((line= bufferedReader.readLine())!=null){

            String[] totalStringArrayInALine = line.split(" ");

            for(String str :totalStringArrayInALine){
                listOfStrings.add(str);
                setOfNonRepeatedString.add(str);
            }
        }

        for (Object obj : listOfStrings){
            int count = Collections.frequency(listOfStrings,obj.toString());
                bufferedWriter.write(obj.toString().substring(0,obj.toString().length()-1)+" "+count);

                bufferedWriter.write(obj.toString()+" "+count);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
