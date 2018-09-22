package HW1.edu.fitchburgstate.csc7400;
import java.util.Iterator;
import java.util.List;

/**
 * FindGuitarTester class searches the inventory with required guitar specifications and prints the matching guitar
 *
 * Contains methods to call Inventory and Guitar Class methods
 *
 * @author:OMontalv
 *
 * Version:1.0
 *
 */

public class FindGuitarTester {

  /**
   * The application's entry point.
   *
   * @param args supplies command-line arguments as an array of String objects
   *
   *
   */
  public static void main(String[] args) {

    // Set up Rick's guitar inventory by creating object for Inventory

    Inventory inventory = new Inventory();

    // Passing inventory reference to InitializeInventory method

    initializeInventory(inventory);

    // Creating Object for Guitar by calling its constructor

    Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor",
            "electric", "Alder", "Alder");

    // Calling search method of Inventory class by passing search pattern to find match

    List<Guitar> guitarList = inventory.search(whatErinLikes);

    //If match found display the details to Erin

    if (guitarList != null) {
      System.out.println("Erin, you might like this " );
      for (Iterator i = guitarList.iterator(); i.hasNext();) {
        Guitar guitar = (Guitar)i.next();
        System.out.println(
                guitar.getManufacturer() + " " + guitar.getModel() +  " " +
                        guitar.getType() + " guitar:\n   " +
                        guitar.getBackWood() + " back and sides,\n   " +
                        guitar.getTopWood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!");
      }
    }

    else {

      // If no match found display the below message

      System.out.println("Sorry, Erin, we have nothing for you.");
    }
  }

  // Calling addGuitar method to initialize multiple Guitar objects

  private static void initializeInventory(Inventory inventory) {
    inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic",
            "Indian Rosewood", "Sitka");
    inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric",
            "Alder", "Alder");
    inventory.addGuitar("V9512", 1549.95, "Fender", "Stratocastor", "electric",
            "Alder", "Alder");
    inventory.addGuitar("122784", 5495.95, "Martin", "D-18", "acoustic",
            "Mahogany", "Adirondack");
    inventory.addGuitar("76531", 6295.95, "Martin", "OM-28", "acoustic",
            "Brazilian Rosewood", "Adriondack");
    inventory.addGuitar("70108276", 2295.95, "Gibson", "Les Paul", "electric",
            "Mahogany", "Maple");
    inventory.addGuitar("82765501", 1890.95, "Gibson", "SG '61 Reissue",
            "electric", "Mahogany", "Mahogany");
    inventory.addGuitar("77023", 6275.95, "Martin", "D-28", "acoustic",
            "Brazilian Rosewood", "Adirondack");
    inventory.addGuitar("1092", 12995.95, "Olson", "SJ", "acoustic",
            "Indian Rosewood", "Cedar");
    inventory.addGuitar("566-62", 8999.95, "Ryan", "Cathedral", "acoustic",
            "Cocobolo", "Cedar");
    inventory.addGuitar("6 29584", 2100.95, "PRS", "Dave Navarro Signature",
            "electric", "Mahogany", "Maple");
  }
}
