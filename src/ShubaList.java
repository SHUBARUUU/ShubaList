// An object that builds the data structure from scratch
// Objective for tonight:
// Add method.
// Remove method.

public class ShubaList<Item> {
    private Item[] datas;
    private int size;

    //Constructor - start up
    public ShubaList(){
        datas = (Item[]) new Object[10];
        size = 0;
    }
//  Adding Shuba!
    public Item[] addShuba(Item item){
        datas[size++] = item;
        return datas;
    }
//  Viewing Shuba!
    public void viewShuba(int index){
        System.out.println(datas[index]);
    }


}//end of class

//LEARNINGS:
// Casting = pretending something is a type (only works if compatible)
// Generic Types <> = Exists only in compile time, not in runtime.
// Using new Object[10] + (Item[]) in the constructor sets up your array properly
// Non-Static: Object level, unique per object ; Static: Class level, shares the same values.


