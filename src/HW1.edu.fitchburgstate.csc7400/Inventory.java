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
  private List<Guitar> guitarsList = new LinkedList<Guitar>();


  /**
   * Adds guitar details to list
   * @param serialNumber manufacturer serial number
   * @param price store price
   * @param builder the guitar's manufacturer
   * @param model the manufacturers model
   * @param type guitar type (electric/accoustic)
   * @param backWood the wood used for the guitar body
   * @param topWood the wood used for the guitar's face
   */

  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {

    Guitar guitar = new Guitar(serialNumber, price, builder,
            model, type, backWood, topWood);
    guitars.add(guitar);

  }

  /**
   * Gets information of guitar against the serial number
   * @param serialNumber
   * @return
   */
  public Guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar) i.next();
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
  public List<Guitar> search(Guitar searchGuitar) {

    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar) i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getManufacturer();
      if ((builder != null) && (!builder.equals("")) &&
              (!builder.equalsIgnoreCase(guitar.getManufacturer())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
              (!model.equalsIgnoreCase(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
              (!type.equalsIgnoreCase(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
              (!backWood.equalsIgnoreCase(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
              (!topWood.equalsIgnoreCase(guitar.getTopWood())))
        continue;
      guitarsList.add(guitar);
    }
    return guitarsList;
  }
}
