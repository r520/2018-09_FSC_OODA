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
 *
 */
public class GuitarSpec {

    /**
     * Full constructor
     *
     * @param serialNumber manufacturer serial number
     * @param price store price
     * @param manufacturer the guitar's manufacturer
     * @param model the manufacturers model
     * @param type guitar type (electric/accoustic)
     * @param backWood the wood used for the guitar body
     * @param topWood the wood used for the guitar's face
     */
    // GuitarSpec constructor

    /**
     * The name of the manufacturer
     */
    private Manufacturer manufacturer;

    /**
     * The manufacturer model number
     */
    private String model;

    /**
     * The guitar type (electric/acoustic)
     */
    private Type type;

    /**
     * The wood used for the back of the guitar
     */
    private TopWoodandBackwood backwood;

    /**
     * The wood used for the face of the guitar
     */
    private TopWoodandBackwood topwood;

    public GuitarSpec(
            Manufacturer manufacturer, String model,
            Type type, TopWoodandBackwood backwood, TopWoodandBackwood topwood) {

        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
    }
    public GuitarSpec(){

    }

    /**
     * Returns the manufacturer serial number
     *
     * NB: Gets and sets do not need @params or @returns because they do one thing which
     * is already in the comment
     */

    public enum TopWoodandBackwood{
        IndianRosewood,BrazilianRosewood,Mahogany,Maple,Cocobolo,Cedar,Adirondack,Alder,Sitka
    }

    public enum Manufacturer{
        Fender,Martin,Gibson,Collings,Olson,Ryan,PRS
    }

    public enum Type{
        Electric,Acoustic
    }

    /**
     * Returns the name of the manufacturer
     */
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * Returns the manufacturer model
     */
    public String getModel() {
        return model;
    }

    /**
     * Returns the guitar type
     * @return
     */
    public Type getType() {
        return type;
    }

    /**
     * Returns the type of wood used in the body
     */
    public TopWoodandBackwood getBackWood() {
        return backwood;
    }

    /**
     * Returns the type of wood used in the face
     * @return
     */
    public TopWoodandBackwood getTopWood() {
        return topwood;
    }

    /**
     * This method matches the user guitar specifications to the guitar specifications available in the Inventory
     * User specifications will be matched against constants in the enum
     * @param guitarSpec object of GuitarSpec class
     * @param guitar object of guitar class
     */

    public boolean match(GuitarSpec guitarSpec ,Guitar guitar) {

        if (((guitarSpec.getManufacturer()== null) ||
                (guitar.guitarSpec.getManufacturer()).equals(guitarSpec.getManufacturer())) &&
                ((guitarSpec.getType()== null) ||
                        (guitar.guitarSpec.getType()).equals(guitarSpec.getType())) &&
                ((guitarSpec.getBackWood()== null) ||
                        (guitar.guitarSpec.getBackWood()).equals(guitarSpec.getBackWood())) &&
                ((guitarSpec.getTopWood()== null) ||
                        (guitar.guitarSpec.getTopWood()).equals(guitarSpec.getTopWood()))){

            return true;}
        else{
            return false;}

    }

}

