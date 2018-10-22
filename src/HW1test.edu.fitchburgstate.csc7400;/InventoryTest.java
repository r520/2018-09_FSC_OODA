package HW1test.edu.fitchburgstate.csc7400;

import static org.junit.jupiter.api.Assertions.*;


import HW1.edu.fitchburgstate.csc7400.GuitarSpec;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import HW1.edu.fitchburgstate.csc7400.Guitar;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec;
import HW1.edu.fitchburgstate.csc7400.Inventory;
import HW1.edu.fitchburgstate.csc7400.FindGuitarTester;

import java.util.List;

public class InventoryTest {

    Inventory inventory = new Inventory();
    GuitarSpec guitarspec1;
    GuitarSpec guitarspec2;
    GuitarSpec guitarspec3;


    @BeforeEach
    public void setup(){

        GuitarSpec guitarspec1 = new GuitarSpec(GuitarSpec.Manufacturer.Collings, "CJ", GuitarSpec.Type.Electric,
                GuitarSpec.TopWoodandBackwood.Mahogany, GuitarSpec.TopWoodandBackwood.Maple);

        GuitarSpec guitarspec2 = new GuitarSpec(GuitarSpec.Manufacturer.Fender, "CJ", GuitarSpec.Type.Acoustic,
                GuitarSpec.TopWoodandBackwood.IndianRosewood, GuitarSpec.TopWoodandBackwood.Maple);

        GuitarSpec guitarspec3 = new GuitarSpec(GuitarSpec.Manufacturer.Fender, "CJ", GuitarSpec.Type.Acoustic,
                GuitarSpec.TopWoodandBackwood.IndianRosewood, GuitarSpec.TopWoodandBackwood.Sitka);


        inventory.addGuitar("1129",2999.5,guitarspec1);
        inventory.addGuitar("1130",3999.5,guitarspec2);
        inventory.addGuitar("1131",2555.5,guitarspec3);

    }

    /**
     * Tests whether addGuitar added the object to the inventory
     */
    @Test
    void testaddGuitarfunction() {
        Guitar value = inventory.getGuitar("1129");
        assertNotNull(value);
    }

    /**
     * Test to see that search guitar returns all the guitars with topwood Maple
     */
    @Test
    void testSearchGuitarbytopwood() {

        GuitarSpec whatErinLikes = new GuitarSpec(null, "", null, null, GuitarSpec.TopWoodandBackwood.Maple);
        List<Guitar> guitarsResult = inventory.search(whatErinLikes);
        assertEquals(1, guitarsResult.size());
    }
    /**
     * Test to see that search guitar returns all the guitars with specified Manufacturer and topwood
     */
    @Test
    void testSearchGuitarbyManufacturertopwood(){

        GuitarSpec whatErinLikes = new GuitarSpec(GuitarSpec.Manufacturer.Fender, "", null, null, GuitarSpec.TopWoodandBackwood.Maple);
        List<Guitar> guitarsResult = inventory.search(whatErinLikes);
        assertEquals(1, guitarsResult.size());
    }

    @Test
    /**
     * Test to see that search guitar returns all the guitars with backwood IndianRosewood
     */
    void testSearchGuitarbybackwood() {

        GuitarSpec whatErinLikes = new GuitarSpec(null, "", null, GuitarSpec.TopWoodandBackwood.IndianRosewood, null);
        List<Guitar> guitarsResult = inventory.search(whatErinLikes);
        assertEquals(2, guitarsResult.size());
    }

    @Test
    /**
     * Test to see when no match is found
     */
    void testSearchGuitarNoMatch() {

        GuitarSpec whatErinLikes = new GuitarSpec(null, "", null, GuitarSpec.TopWoodandBackwood.Maple, null);
        List<Guitar> guitarsResult = inventory.search(whatErinLikes);
        assertEquals(0, guitarsResult.size());
    }

    @Test
    /**
     * Test to see when no match is found 2
     */
    void testSearchGuitarNoMatch1() {

        GuitarSpec whatErinLikes = new GuitarSpec(GuitarSpec.Manufacturer.Martin, "", null, GuitarSpec.TopWoodandBackwood.Maple, null);
        List<Guitar> guitarsResult = inventory.search(whatErinLikes);
        assertEquals(0, guitarsResult.size());
    }

    @Test
    /**
     * Test to see when no match is found with single specification
     */
    void testNoMatchSingleSpec() {

        GuitarSpec whatErinLikes = new GuitarSpec(null, "", null, GuitarSpec.TopWoodandBackwood.Maple, null);
        List<Guitar> guitarsResult = inventory.search(whatErinLikes);
        assertEquals(0, guitarsResult.size());
    }

    @Test
    /**
     * Test to see when no match is found with multiple specification
     */
    void testNoMatchMultipleSpec() {

        GuitarSpec whatErinLikes = new GuitarSpec(null, "", null, GuitarSpec.TopWoodandBackwood.Sitka, GuitarSpec.TopWoodandBackwood.IndianRosewood);
        List<Guitar> guitarsResult = inventory.search(whatErinLikes);
        assertEquals(0, guitarsResult.size());
    }

    @Test
    /**
     * Test to see whether the expected guitars are returned back or not
     */
    void testIsMatch(){
        GuitarSpec whatErinLikes = new GuitarSpec(GuitarSpec.Manufacturer.Fender, "", null, GuitarSpec.TopWoodandBackwood.IndianRosewood, null);
        List<Guitar> guitarsResult = inventory.search(whatErinLikes);
        Boolean isMatch = false;
        for (Iterator i = guitarsResult.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            if (((whatErinLikes.getManufacturer()== null) ||
                    (guitar.guitarSpec.getManufacturer())==(whatErinLikes.getManufacturer())) &&
                    ((whatErinLikes.getType()== null) ||
                            (guitar.guitarSpec.getType())==(whatErinLikes.getType())) &&
                    ((whatErinLikes.getBackWood()== null) ||
                            (guitar.guitarSpec.getBackWood())==(whatErinLikes.getBackWood())) &&
                    ((whatErinLikes.getTopWood()== null) ||
                            (guitar.guitarSpec.getTopWood())==(whatErinLikes.getTopWood()))){

                isMatch = true;

            }

        }

        assertEquals(2, guitarsResult.size());

        assertEquals(true, isMatch);
    }

}



}


