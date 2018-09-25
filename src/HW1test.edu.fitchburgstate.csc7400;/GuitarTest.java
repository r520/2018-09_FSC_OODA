package HW1test.edu.fitchburgstate.csc7400;

import static org.junit.jupiter.api.Assertions.*;
import HW1.edu.fitchburgstate.csc7400.Guitar;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec.TopWoodandBackwood;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec.Type;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec.Manufacturer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec;

class GuitarTest {

    Guitar testGuitar;
    //GuitarSpec guitarSpec = new GuitarSpec();

    //adding a test guitar to  the inventory
    @BeforeEach
    void setUp() throws Exception {
        GuitarSpec guitarspec = new GuitarSpec(Manufacturer.Gibson,"EasyLearn",Type.Electric,TopWoodandBackwood.Maple,TopWoodandBackwood.Adirondack );
        this.testGuitar = new Guitar(
                "AB123", // serial number
                203.35, // store price
                guitarspec
        );
    }

    @Test
        // Test to get the serial number
    void testGetSerialNumber() {
        String expected = "AB123";
        String returned = this.testGuitar.getSerialNumber();
        assertEquals(expected, returned, String.format("Serial number %s != %s", expected, returned));
    }

    @Test
        // Test to get the price
    void testGetPrice() {
        double expected = 203.35;
        double returned = this.testGuitar.getPrice();
        assertEquals(expected, returned, 0.01, String.format("Price %f != %f", expected, returned));
    }

    @Test
        // Test to set the price
    void testSetPrice() {
        double expected = 225.10;
        this.testGuitar.setPrice(expected);
        double returned = this.testGuitar.getPrice();
        assertEquals(expected, returned, String.format("Price %f != %f", expected, returned));
    }

    @Test
        // Test to get the Manufacturer
    void testGetManufacturer() {
        String expected = "Gibson";
        GuitarSpec.Manufacturer returned = this.testGuitar.guitarSpec.getManufacturer();
        assertEquals(expected, returned, String.format("Manufacturer %s != %s", expected, returned));
    }

    @Test
        // Test to get the Model
    void testGetModel() {
        String expected = "EasyLearn";
        String returned = this.testGuitar.guitarSpec.getModel();
        assertEquals(expected, returned, String.format("Model %s != %s", expected, returned));
    }

    @Test
        // Test to get the Type
    void testGetType() {
        String expected = "electric";
        Type returned = this.testGuitar.guitarSpec.getType();
        assertEquals(expected, returned, String.format("Type %s != %s", expected, returned));
    }

    @Test
        // Test to get the BackWood
    void testGetBackWood() {
        String expected = "Maple";
        TopWoodandBackwood returned = this.testGuitar.guitarSpec.getBackWood();
        assertEquals(expected, returned, String.format("Back wood %s != %s", expected, returned));
    }

    @Test
        // Test to get the TopWood
    void testGetTopWood() {
        String expected = "Adirondack";
        TopWoodandBackwood returned = this.testGuitar.guitarSpec.getTopWood();
        assertEquals(expected, returned, String.format("Top wood %s != %s", expected, returned));
    }
}
