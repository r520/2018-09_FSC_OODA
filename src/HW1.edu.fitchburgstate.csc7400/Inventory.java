/**
 * Class: OOAD-CSC7400
 * Professor: Orlando Montalvo
 * Assignment: HW1
 * Student: Radhika Kasu
 * @author:OMontalv
 * Version:1.0
 */
package HW1.edu.fitchburgstate.csc7400;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Class Inventory - contains methods for adding, searching and retrieving guitar
 * This class helps the customer to find the Guitar of their Specification.
 *
 */

public class Inventory {
    // initializing guitars linked list to store Guitar objects
    private List<Guitar> guitars = new LinkedList<Guitar>();
    private List<Guitar> guitarsResult = new LinkedList<Guitar>();


    /**
     * Add guitar in inventory with guitar description provided by Rick
     * @param serialNumber
     * @param price
     * @param guitarSpec
     */

    public void addGuitar(String serialNumber, double price,
                          GuitarSpec guitarSpec) {
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }
    /**
     * Get guitar in inventory with guitar description provided by Rick
     * @param serialNumber Guitar object
     * @return guitar with the serial number mentioned else returns null
     */

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    /**
     * Search guitar in inventory with guitar description provided by customer
     * @param searchGuitar Guitar object
     * @return guitar with the specification mentioned else returns null
     */

    public List<Guitar> search(GuitarSpec searchGuitar) {


        GuitarSpec guitarSpec = new GuitarSpec();
        // Matching user specification getters with inventory search getters
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            // This condition checks the guitars spec
            if(guitarSpec.match(searchGuitar,guitar))
            {
                guitarsResult.add(guitar);
            }
        }
        return guitarsResult;
    }
}
