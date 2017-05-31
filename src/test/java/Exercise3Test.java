import org.junit.Test;
import static org.junit.Assert.*;

import haskell.Exercise3;

public class Exercise3Test
{
    //Testing lazy() from Exercise3
    @Test
    public void testLazy0()
    {
        assertEquals(Exercise3.lazy(0), 1);
    }
    @Test
    public void testLazy1()
    {
        assertEquals(Exercise3.lazy(1), 2);
    }
    @Test
    public void testLazy2()
    {
        assertEquals(Exercise3.lazy(10), 56);
    }

    //Testing triangle() from Exercise3
    @Test
    public void testTriangle0()
    {
        assertEquals(Exercise3.triangle(0), 0);
    }
    @Test
    public void testTriangle1()
    {
        assertEquals(Exercise3.triangle(1), 1);
    }
    @Test
    public void testTriangle2()
    {
        assertEquals(Exercise3.triangle(10), 55);
    }
}
