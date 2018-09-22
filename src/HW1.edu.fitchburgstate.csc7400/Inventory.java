/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
 * Date: 2018-09-14
 * Student: Radhika Kasu
 */
package HW1.edu.fitchburgstate.csc7400;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Class Inventory - For adding, searching and retrieving  from collection of Guitars.
 * This class helps  the customer to find the Guitar of their Specification.
 *
 * @author:OMontalv
 *
 * Version:1.0
 */

public class Inventory {
  // initializing guitars linked list to store Guitar objects
  private List<Guitar> guitars = new LinkedList<Guitar>();
  private List<Guitar> guitarsList = new LinkedList<Guitar>();


  // creating Guitar objects and adding to linked list guitars

  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {

    Guitar guitar = new Guitar(serialNumber, price, builder,
            model, type, backWood, topWood);
    guitars.add(guitar);

  }

  public Guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar) i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }

  // Performing search in the existing Guitar objects in the linked list guitars
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
