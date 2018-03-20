import java.io.*;
import java.util.*;

public class ReadAndWriteFile {

    public void readAndWriteFile(String fileName) throws FileNotFoundException {
        String writeToFile = "temp1.txt";
        // This will reference one line at a time
        String line = null;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);
            // Always wrap FileReader in BufferedReader.
            FileWriter fileWriter = new FileWriter(writeToFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            List list = new ArrayList();
            Set setOfWords = new HashSet();
            while((line = bufferedReader.readLine()) != null) {

                String[] wordsFromLine = line.split(" ");
                for(String str : wordsFromLine){
                    list.add(str);
                    setOfWords.add(str);
                }
            }
            for(Object str : setOfWords){
                int numberOfTimes = Collections.frequency(list,str.toString());
                bufferedWriter.write(str.toString()+" "+numberOfTimes);
                bufferedWriter.newLine();
            }
            // Always close files.
            bufferedReader.close();
            bufferedWriter.close();
        }
        catch(FileNotFoundException ex) {
            throw ex;
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }


    public static void main(String [] args) {

        // The name of the file to open.
        String readFromFile = "temp.txt";
        String writeToFile = "temp1.txt";
        // This will reference one line at a time
        String line = null;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(readFromFile);
            // Always wrap FileReader in BufferedReader.
            FileWriter fileWriter = new FileWriter(writeToFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            List list = new ArrayList();
            Set setOfWords = new HashSet();
            while((line = bufferedReader.readLine()) != null) {

                String[] wordsFromLine = line.split(" ");
                for(String str : wordsFromLine){
                   list.add(str);
                   setOfWords.add(str);
                }
            }
            for(Object str : setOfWords){
                int numberOfTimes = Collections.frequency(list,str.toString());
                bufferedWriter.write(str.toString()+" "+numberOfTimes);
                bufferedWriter.newLine();
            }
            // Always close files.
            bufferedReader.close();
            bufferedWriter.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            readFromFile + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + readFromFile + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
