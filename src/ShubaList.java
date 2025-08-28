// An object that builds the data structure from scratch.
//  Will add the sorting and searching algorithms..

public class ShubaList<Item> {
    private Item[] datas;
    private int size;

    //Constructor - start up
    @SuppressWarnings("unchecked")//Suppresses the warning.
    public ShubaList() {
        datas = (Item[]) new Object[3];
        size = 0;
    }

//  Interactive Methods

    //Adding Value Shuba!
    public boolean addShuba(Item item) {
        if (sizeShuba() >= datas.length) {
            expandArray();
        }

        datas[size++] = item;
        return true;
    }

    //Removing Value Shuba!
    public boolean removeShuba(int removeIndex) {
        if (removeIndex < 0 || removeIndex >= sizeShuba())
            return false;

        for (int i = removeIndex; i < sizeShuba() - 1; i++) {
            datas[i] = datas[i + 1];
        }

        datas[sizeShuba() - 1] = null;
        size--;

        return true;
    }

    public boolean setShuba(int index, Item changeItem) {
        for (int i = 0; i < sizeShuba(); i++) {
            if (datas[i].equals(datas[index])) {
                datas[index] = changeItem;
                return true;
            }
        }

        return false;
    }


    //Getting Size Shuba!
    public int sizeShuba() {
        return size;
    }

    //Getting Value Shuba!
    public Item getShuba(int getIndex) {
        return datas[getIndex];

    }

    //  Object methods.
    @SuppressWarnings("unchecked")
    private void expandArray() {
        Item[] tempDatas = datas;

        datas = (Item[]) new Object[datas.length * 2];

        for (int i = 0; i < sizeShuba(); i++) {
            datas[i] = tempDatas[i];
        }

    }

}//end of class

//LEARNINGS:
// Casting = pretending something is a type (only works if compatible)
// Generic Types <> = Exists only in compile time, not in runtime.
// Using new Object[10] + (Item[]) in the constructor sets up your array properly
// Non-Static: Object level, unique per object ; Static: Class level, shares the same values.
// null is no value "marker" for every object -- default empty value


