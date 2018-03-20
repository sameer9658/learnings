/**
 * Created by 609684007 on 4/5/2017.
 */
public class LinkedHashEntry {

    String key;
    int value;
    LinkedHashEntry next;

    /* Constructor */
    LinkedHashEntry(String key, int value)
    {
        this.key = key;
        this.value = value;
        this.next = null;
    }

}
