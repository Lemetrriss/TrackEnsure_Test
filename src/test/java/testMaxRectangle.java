import org.junit.Assert;
import org.junit.Test;

public class testMaxRectangle {

    Test2 t2 = new Test2();

    @Test
    public void testSquare(){
        int expected = t2.test(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        Assert.assertEquals(expected, 49);
    }
}
