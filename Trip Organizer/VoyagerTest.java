

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VoyagerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VoyagerTest
{
    /**
     * Default constructor for test class VoyagerTest
     */
    public VoyagerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test1()
    {
    }

    @Test
    public void test2()
    {
        Voyager voyager1 = new Voyager("Felix", 715.0f);
        assertEquals(null, voyager1.getTrajectory());
    }

    @Test
    public void test3()
    {
        Trajectory transpor1 = new Trajectory("train", "Leuven", "Zaventem", 12.3f);
        Voyager voyager1 = new Voyager("Felix", 715.0f);
        voyager1.setTrajectory(transpor1);
        assertEquals("train", voyager1.getTrajectory().getType());
    }
    
    @Test
    public void test4()
    {
        Voyager voyager1 = new Voyager("Felix", 715.0f);
        voyager1.bookRide();
        assertEquals(715.0f, voyager1.getBudget(), 0.1f);
    }
    /**
     * Method test5: check if price calculation is correct when a discount is given
     *
     * remove comment when all necessary code is available
    @Test
    public void test5()
    {
        MeansOfTransportation transpor1 = new MeansOfTransportation("airplane", "Zaventem", "Beijing", 623.0f);
        Voyager voyager1 = new Voyager("Felix", 715.0f);
        voyager1.setMeansOfTransportation(transpor1);
        transpor1.setDiscount(true);
        assertEquals(311.5f, voyager1.getMeansOfTransportation().use(), 0.1f);
    }
*/
    /**
     * Method test6: Make complete trip, check if within budget
     *
     * remove comment when all necessary code is available
    @Test
    public void test6()
    {
        Voyager voyager1 = new Voyager("Felix", 715.0f);
        MeansOfTransportation transpor1 = new MeansOfTransportation("train", "Leuven", "Zaventem", 12.3f);
        voyager1.setMeansOfTransportation(transpor1);
        transpor1.setDiscount(true);
        voyager1.bookRide();
        MeansOfTransportation transpor2 = new MeansOfTransportation("airplane", "Zaventem", "Beijing", 623.0f);
        voyager1.setMeansOfTransportation(transpor2);
        voyager1.bookRide();
        MeansOfTransportation transpor3 = new MeansOfTransportation("bus", "Beijing", "Shangai", 85.0f);
        voyager1.setMeansOfTransportation(transpor3);
        voyager1.bookRide();
        assertEquals(true, voyager1.tripPossible());
    }
*/
    /**
     * Method test7: analog as 6, but with not enough budget
     *
     * remove comment when all necessary code is available
    @Test
    public void test7()
    {
        Voyager voyager1 = new Voyager("Felix", 700.0f);
        MeansOfTransportation transpor1 = new MeansOfTransportation("train", "Leuven", "Zaventem", 12.3f);
        voyager1.setMeansOfTransportation(transpor1);
        transpor1.setDiscount(true);
        voyager1.bookRide();
        MeansOfTransportation transpor2 = new MeansOfTransportation("airplane", "Zaventem", "Beijing", 623.0f);
        voyager1.setMeansOfTransportation(transpor2);
        voyager1.bookRide();
        MeansOfTransportation transpor3 = new MeansOfTransportation("bus", "Beijing", "Shangai", 85.0f);
        voyager1.setMeansOfTransportation(transpor3);
        voyager1.bookRide();
        assertEquals(false, voyager1.tripPossible());
    }
*/
}



