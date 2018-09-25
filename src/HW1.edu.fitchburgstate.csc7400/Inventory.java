/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
 * @Version 1.0
 * Student: Radhika Kasu
 * Date: 09/14/2018
 */
package HW1.edu.fitchburgstate.csc7400;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Class Inventory - For adding, searching and retrieving  from collection of Guitars.
 * This class helps  the customer to find the Guitar of their choice.
 */

public class Inventory {
  // initializing guitars linked list to store Guitar objects
  private List<Guitar> guitars = new LinkedList<Guitar>();
  private List<Guitar> guitarsResult = new LinkedList<Guitar>();

  // creating Guitar objects and adding to linked list guitars

  public void addGuitar(String serialNumber, double price,
                        GuitarSpec guitarSpec) {
    Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
    guitars.add(guitar);
  }
  public Guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }

  // Performing search in the existing Guitar objects in the linked list guitars
  public List<Guitar> search(GuitarSpec searchGuitar) {

     /* for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getManufacturer();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getManufacturer())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))
        continue;
      return guitar;*/

    GuitarSpec guitarSpec = new GuitarSpec();
    // Matching user specifications getters with inventory search getters
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
