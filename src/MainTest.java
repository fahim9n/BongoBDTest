import org.junit.Test;
import test.two.Vehicle.CarBuilder;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void configureBuildTest() {
        CarBuilder builder = new CarBuilder();
        Main.configureBuild(builder);
        assertTrue(builder.hasGas);
        assertEquals(2, builder.numOfPassengers);
        assertEquals(3, builder.numOfWheels);
    }
}