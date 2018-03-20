import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndWriteFileTest {

    @Test
    public void testFileReadAndWrite() throws IOException
    {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        readAndWriteFile.readAndWriteFile("temp.txt");
        BufferedReader br = new BufferedReader(new FileReader("temp1.txt"));
        Assert.assertTrue(br.readLine()!=null);
    }

    @Test(expected = FileNotFoundException.class)
    public void testFileReadAndWriteWithException() throws FileNotFoundException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        readAndWriteFile.readAndWriteFile("temp2.txt");
    }

    @Test
    public void testFileRead() throws IOException
    {
        FileReadAndWritePractice readAndWriteFile = new FileReadAndWritePractice();
        readAndWriteFile.readAndWrite("temp.txt");
        //BufferedReader br = new BufferedReader(new FileReader("temp1.txt"));

    }

}
