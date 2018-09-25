/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
 * Student:Radhikas Kasu
 *
 * Date: 2018-09-14
 */

package HW1.edu.fitchburgstate.csc7400;

/**
 * Guitar contains the Unique Properties- Serial Number, Price and GuitarSpec
 * Rick's music store
 *
 *
 */
public class Guitar {


	// Guitar Properties

	public String serialNumber;
	public double price;
	public GuitarSpec guitarSpec;

	/**
	 * Guitar constructor with below arguments
	 *
	 * @param serialNumber manufacturer serial number
	 * @param price store price
	 * @param guitar Specification
	 */
	public Guitar(String serialNumber, double price,GuitarSpec guitarSpec) {

		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = guitarSpec;
	}

	/**
	 * Returns the manufacturer serial number
	 *
	 * NB: Gets and sets do not need @params or @returns because they do one thing which
	 * is already in the comment
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Returns store price of guitar
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the store price of the guitar
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	/**
	 * The guitars manufacturer serial number
	 */
	//private String serialNumber;

	/**
	 * Rick's price for the guitar
	 */
	//private double price;

	public GuitarSpec getguitarSpec() {
		return guitarSpec;
	}
}
