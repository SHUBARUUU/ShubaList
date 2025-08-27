// An object that builds the data structure from scratch
// Remove method.
public class ShubaList<Item> {
    private Item[] datas;
    private int size;

    //Constructor - start up
    @SuppressWarnings("unchecked")//Suppresses the warning.
    public ShubaList() {
        datas = (Item[]) new Object[10];
        size = 0;
    }

//  Interactive Methods

    //Adding Value Shuba!
    public boolean addShuba(Item item) {
        datas[size++] = item;
        return true;
    }

    //Getting Value Shuba!
    public Item getShuba(int getIndex) {
        return datas[getIndex];

    }

    //Removing Value Shuba!
    public boolean removeShuba(int removeIndex) {
        if (removeIndex < 0 || removeIndex > size)
            return false;

        for (int i = removeIndex; i < sizeShuba() - 1; i++) {
            datas[i] = datas[i + 1];
        }
        datas[sizeShuba() - 1] = null;
        size--;

        return true;
    }

    //Array Size Shuba!
    public int sizeShuba() {
        return size;
    }

//  Object methods.
    //Add the array resizing methods when full.

}//end of class

//LEARNINGS:
// Casting = pretending something is a type (only works if compatible)
// Generic Types <> = Exists only in compile time, not in runtime.
// Using new Object[10] + (Item[]) in the constructor sets up your array properly
// Non-Static: Object level, unique per object ; Static: Class level, shares the same values.
// null is no value "marker" for every object -- default empty value


