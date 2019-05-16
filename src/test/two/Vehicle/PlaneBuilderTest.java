package test.two.Vehicle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneBuilderTest {
    PlaneBuilder planeBuilder;

    @Before
    public void setUp() throws Exception {
        planeBuilder = new PlaneBuilder();
    }

    @Test
    public void buildTest() {
        planeBuilder.setNumOfPassengers(2);
        planeBuilder.setNumOfWheels(4);
        planeBuilder.setHasGas(true);
        Vehicle plane = planeBuilder.build();
        assertEquals(Plane.class, plane.getClass());
        assertEquals(2, plane.set_num_of_passengers());
        assertEquals(4, plane.set_num_of_wheels());
        assertTrue(plane.has_gas());
    }
}