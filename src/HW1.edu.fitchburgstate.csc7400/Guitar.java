/**
 * Class: OOAD-CSC7400
 * Professor: Orlando Montalvo
 * Assignment: HW1
 * Student: Radhika Kasu
 * @author:OMontalv
 * Version:1.0
 */

package HW1.edu.fitchburgstate.csc7400;
/**
 * Guitar contains the information needed to keep track of a type of guitar from
 * Rick's music store
 * Initialize Getter and setters for guitar specifications
 *
 */
public class Guitar {

	public String serialNumber;
	public double price;
	public GuitarSpec guitarSpec;

	/**
	 * Guitar constructor with below arguments
	 * @param serialNumber manufacturer serial number
	 * @param price store price
	 * @param guitarSpec Specifications
	 *
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
	 * Returns Erin's specifications for the guitar
	 */

	public GuitarSpec getguitarSpec() {
		return guitarSpec;
	}
}
