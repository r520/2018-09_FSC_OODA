package HW1.test.edu.fitchburgstate.csc7400;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import HW1.edu.fitchburgstate.csc7400.Guitar;
import HW1.edu.fitchburgstate.csc7400.Inventory;
import HW1.edu.fitchburgstate.csc7400.FindGuitarTester;

class InventoryTest {

    @Test
    void Inventorytest() {
        //Test to see if the serial number is returned correctly.
        Inventory inventory = new Inventory();
        inventory.addGuitar("1127", 4999.95, "Collings", "CJ", "electric",
                "Indian Rosewood", "Sitka");
        Guitar value = inventory.getGuitar("1127"); // Searching the guitar with the serial number.
        assertEquals("1127", value.getSerialNumber());

        //Test to see that addGuitar adds data to inventory
        Inventory inventory1 = new Inventory();
        inventory1.addGuitar("1127", 4999.95, "Collings", "CJ", "electric",
                "Indian Rosewood", "Sitka");
        Guitar value1 = inventory1.getGuitar("1127");
        assertNotNull(value1);

        //Test to see if two objects of same data can be added
        Inventory inventory2 = new Inventory();
        inventory2.addGuitar("1127", 4999.95, "Collings", "CJ", "electric",
                "Indian Rosewood", "Sitka");
        Guitar value2 = inventory2.getGuitar("1127");
        assertEquals(value1.getSerialNumber(),value2.getSerialNumber());


        //Test to see that Price, Backwood is not Null
        Inventory inventory3 = new Inventory();
        inventory3.addGuitar("1127", 4999.95, "Collings", "CJ", "electric",
                "Indian Rosewood", "Sitka");
        Guitar value3 = inventory3.getGuitar("1127");
        assertNotNull(value3.getPrice());
        assertNotNull(value3.getBackWood());


        //Test to see that search returns correct values
        //Guitar value3 = inventory3.search("");
        assertNotNull(value3.getPrice());
        assertNotNull(value3.getBackWood());


    }


}


