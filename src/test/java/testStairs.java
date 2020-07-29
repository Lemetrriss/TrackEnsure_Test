import org.junit.Assert;
import org.junit.Test;

public class testStairs {

    Test1 t1 = new Test1();

    @Test
    public void testSquarePositive(){
        int expected = t1.test(21);
        Assert.assertEquals(expected, 6);
    }

    @Test
    public void testSquarePositive2(){
        int expected = t1.test(28);
        Assert.assertEquals(expected, 7);
    }

    @Test
    public void testSquareNegative(){
        int expected = t1.test(27);
        Assert.assertNotEquals(expected, 7);
    }
}