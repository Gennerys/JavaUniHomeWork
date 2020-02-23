import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListImplementationTest {

    private IList<Integer> list;

    @Before
    public void setUp() throws Exception {
        list = new ListImplementation<Integer>(10);
    }

    @After
    public void tearDown() throws Exception {
        list = null;
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void checkIndexRange() {
        list.setElement(-1, 123);
    }

    @Test
    public void TestArrayLengthIncrement() {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }

    @Test
    public void size() {
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void getElement() {

        list.add(1);
        Assert.assertEquals(1, list.getElement(0).intValue());
    }

    @Test
    public void insert() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.insert(1, 11);
        Assert.assertEquals(4, list.size());
        int elementAtIndex = list.getElement(1);
        Assert.assertEquals(11, elementAtIndex);
        Assert.assertEquals(3, list.getElement(3).intValue());
    }

    @Test
    public void add() {
        list.add(11);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void remove() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void setElement() {
        list.add(1);
        int testVariable = 44;
        list.setElement(0, testVariable);
        Assert.assertEquals(testVariable, list.getElement(0).intValue());
    }
}