package prototype.items;

//This class extends an extended class and incorporates elements from both as expected.
//The toString() output can't be easily modified though so that either needs to be reworked
//  or just dealt with and classes updated accordingly.
//Either way the toString() building will need to be annotated so that all items work as expected
public class SpaceSuitItem extends ProtectiveItem {
    public SpaceSuitItem(String name, String description){
        //invoking base class Constructor
        super(name, description);
    }

    //Unique characteristics to a space suit
    String Oxygen = "90%";


    /*@Override public String toString(){
        return (super.toString() + ", remaining Oxygen at " + Oxygen + ".");
    }

     */

}