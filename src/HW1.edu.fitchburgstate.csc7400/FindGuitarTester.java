
/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * @Version 1.0
 * Student: Radhika Kasu
 * Date: 09/14/2018
 * Collabarated with Tejaswini
 */

package HW1.edu.fitchburgstate.csc7400;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import HW1.edu.fitchburgstate.csc7400.GuitarSpec.Manufacturer;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec.TopWoodandBackwood;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec.Type;

/**
 * FindGuitarTester class searches the inventory with required guitar specifications and prints the matching guitar
 */
//Contains methods to call Inventory and Guitar Class methods
public class FindGuitarTester {
  //private static List<Guitar> guitarsResult = new LinkedList<Guitar>();

  public static void main(String[] args) {
    // Set up Rick's guitar inventory

    // Creating object for  Inventory
    Inventory inventory = new Inventory();

    // Passing inventory reference to InitializeInventory method
    initializeInventory(inventory);

    // Creating Object for Guitar by calling its constructor

    // Changing "fender" to "Fender" as case sensitivity is not handled
    //Can use  equalsIgnoreCase instead in Inventory class

    GuitarSpec whatErinLikes = new GuitarSpec(null, "", null, TopWoodandBackwood.Alder, TopWoodandBackwood.Alder);

    // Calling search method of Inventory class by passing search pattern

    List<Guitar> guitarsResult = inventory.search(whatErinLikes);
    //if matches display the details to Erin
    if (guitarsResult != null) {
      System.out.println("Erin, you might like this");

      for (Iterator i = guitarsResult.iterator(); i.hasNext(); ) {
        Guitar guitar = (Guitar)i.next();
        System.out.println(
                guitar.getSerialNumber()+ " " + guitar.getguitarSpec().getManufacturer() +  " " +
                        guitar.getguitarSpec().getType() + " guitar:\n   " +
                        guitar.getguitarSpec().getBackWood() + " back and sides,\n   " +
                        guitar.getguitarSpec().getTopWood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!");
        System.out.println("*****************************");
      }

    } else {
      // If no match found display the below message

      System.out.println("Sorry, Erin, we have nothing for you.");
    }

  }

  // calling addGuitar method to initialize Guitar objects
  private static void initializeInventory(Inventory inventory) {
    inventory.addGuitar("11277", 3999.95, new GuitarSpec(Manufacturer.Collings, "CJ", Type.Acoustic,
            TopWoodandBackwood.IndianRosewood, TopWoodandBackwood.Sitka));
    inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Manufacturer.Fender,"Stratocastor",Type.Electric,
            TopWoodandBackwood.Alder, TopWoodandBackwood.Alder));
    inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Manufacturer.Fender, "Stratocastor",Type.Electric,
            TopWoodandBackwood.Alder,TopWoodandBackwood.Alder));
    inventory.addGuitar("V9513", 1549.95, new GuitarSpec(Manufacturer.Fender, "Stratocastor",Type.Electric,
            TopWoodandBackwood.Alder,TopWoodandBackwood.Alder));
    inventory.addGuitar("122784", 5495.95, new GuitarSpec(Manufacturer.Martin, "D-18", Type.Acoustic,
            TopWoodandBackwood.Mahogany, TopWoodandBackwood.Adirondack));
    inventory.addGuitar("76531", 6295.95, new GuitarSpec(Manufacturer.Martin, "OM-28", Type.Acoustic,
            TopWoodandBackwood.BrazilianRosewood, TopWoodandBackwood.Adirondack));
    inventory.addGuitar("70108276", 2295.95, new GuitarSpec(Manufacturer.Gibson, "Les Paul", Type.Electric,
            TopWoodandBackwood.Mahogany, TopWoodandBackwood.Maple));
    inventory.addGuitar("82765501", 1890.95, new GuitarSpec(Manufacturer.Gibson, "SG '61 Reissue",
            Type.Electric, TopWoodandBackwood.Mahogany, TopWoodandBackwood.Mahogany));
    inventory.addGuitar("77023", 6275.95,new GuitarSpec(Manufacturer.Martin, "D-28", Type.Acoustic,
            TopWoodandBackwood.BrazilianRosewood, TopWoodandBackwood.Adirondack));
    inventory.addGuitar("1092", 12995.95, new GuitarSpec(Manufacturer.Olson, "SJ", Type.Acoustic,
            TopWoodandBackwood.IndianRosewood, TopWoodandBackwood.Cedar));
    inventory.addGuitar("566-62", 8999.95, new GuitarSpec(Manufacturer.Ryan, "Cathedral", Type.Acoustic,
            TopWoodandBackwood.Cocobolo, TopWoodandBackwood.Cedar));
    inventory.addGuitar("6 29584", 2100.95, new GuitarSpec(Manufacturer.PRS, "Dave Navarro Signature",
            Type.Electric, TopWoodandBackwood.Mahogany,TopWoodandBackwood.Maple));
  }
}
