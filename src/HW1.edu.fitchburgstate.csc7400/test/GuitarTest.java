/**
 * Class: OOAD-CSC7400
 * Professor: Orlando Montalvo
 * Assignment: HW1
 * Student: Radhika Kasu
 * @author:OMontalv
 * Version:1.0
 */

package HW1.test.edu.fitchburgstate.csc7400;

import static org.junit.jupiter.api.Assertions.*;
import HW1.edu.fitchburgstate.csc7400.Guitar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GuitarTest {

	Guitar testGuitar;


	//adding a test guitar to  the inventory
	@BeforeEach
	void setUp() throws Exception {
		this.testGuitar = new Guitar(
				"AB123", // serial number
				203.35, // store price
				"Gibson", // Manufacturer
				"EasyLearn", // Manufacturer model
				"electric", // Type of Guitar
				"Maple", // Back wood
				"Adirondack" // Face wood
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
		String returned = this.testGuitar.getManufacturer();
		assertEquals(expected, returned, String.format("Manufacturer %s != %s", expected, returned));
	}

	@Test
		// Test to get the Model
	void testGetModel() {
		String expected = "EasyLearn";
		String returned = this.testGuitar.getModel();
		assertEquals(expected, returned, String.format("Model %s != %s", expected, returned));
	}

	@Test
		// Test to get the Type
	void testGetType() {
		String expected = "electric";
		String returned = this.testGuitar.getType();
		assertEquals(expected, returned, String.format("Type %s != %s", expected, returned));
	}

	@Test
		// Test to get the BackWood
	void testGetBackWood() {
		String expected = "Maple";
		String returned = this.testGuitar.getBackWood();
		assertEquals(expected, returned, String.format("Back wood %s != %s", expected, returned));
	}

	@Test
		// Test to get the TopWood
	void testGetTopWood() {
		String expected = "Adirondack";
		String returned = this.testGuitar.getTopWood();
		assertEquals(expected, returned, String.format("Top wood %s != %s", expected, returned));
	}
}
