import org.junit.*;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class AnnotationsTest {

    private ArrayList testList;

    @BeforeClass
    public static void onceExecutedBeforeAll() {
        System.out.println("@BeforeClass: onceExecutedBeforeAll");
    }
    @Before
    public void executedBeforeEach() {
        testList = new ArrayList();
        System.out.println("@Before: executedBeforeEachTestMethod");
    }
    @AfterClass
    public static void onceExecutedAfterAll() {
        System.out.println("@AfterClass: onceExecutedAfterAllTestMethod");
    }
    @After
    public void executedAfterEach() {
        testList.clear();
        System.out.println("@After: executedAfterEach");
    }
    @Test
    public void emptyCollection() {
        assertTrue(testList.isEmpty());
        System.out.println("@Test: EmptyArrayList");
    }
    @Test
    public void oneItemCollection() {
        testList.add("oneItem");
        assertEquals(1, testList.size());
        System.out.println("@Test: OneItemArrayList");
    }
    @Test
    public void checkingTheList(){
        assertTrue(testList.isEmpty());
        System.out.println("@Test: checkingTheList");
    }
    @Ignore
    public void executionIgnored() {
        System.out.println("@Ignore: This execution is ignored");
    }



}
