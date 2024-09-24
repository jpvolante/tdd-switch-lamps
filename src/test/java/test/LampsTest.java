package test;

import org.example.Lamps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LampsTest {

    @Test
    public void testInitial_0_0_Final_1_1() {
        assertEquals(1, Lamps.minSwitches(0, 0, 1, 1));
    }

    @Test
    public void testInitial_0_0_Final_0_1() {
        assertEquals(2, Lamps.minSwitches(0, 0, 0, 1));
    }

    @Test
    public void testInitial_1_0_Final_1_1() {
        assertEquals(1, Lamps.minSwitches(1, 0, 1, 1));
    }

    @Test
    public void testInitial_1_1_Final_0_1() {
        assertEquals(1, Lamps.minSwitches(1, 1, 0, 1));
    }

    @Test
    public void testInitial_0_1_Final_1_0() {
        assertEquals(2, Lamps.minSwitches(0, 1, 1, 0));
    }

    @Test
    public void testInitial_0_1_Final_0_0() {
        assertEquals(1, Lamps.minSwitches(0, 1, 0, 0));
    }

}
