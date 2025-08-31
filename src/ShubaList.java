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
    public void addShuba(Item item) {
        if (sizeShuba() >= datas.length) {
            expandArray();
        }

        datas[size++] = item;
    }

    //Removing Value Shuba!
    public void removeShuba(int removeIndex) {
        if (removeIndex < 0 || removeIndex >= sizeShuba())
            return;

        for (int i = removeIndex; i < sizeShuba() - 1; i++) {
            datas[i] = datas[i + 1];
        }

        datas[sizeShuba() - 1] = null;
        size--;


    }

    //Appointing a new value to the selected index.
    public void setShuba(int index, Item changeItem) {
        for (int i = 0; i < sizeShuba(); i++) {
            if (datas[i].equals(datas[index])) {
                datas[index] = changeItem;
                return;
            }
        }
    }
    //Independent method of the ShubaList, mimics the concept of Merge sorting algorithm
    public void shubaSort(int[] itemSort){
        int length = itemSort.length;

        //Base case.
        if(length <= 1) return;

        int mid = length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[length - mid];

        int leftIndex = 0, rightIndex = 0;

        for (; leftIndex < length; leftIndex++) {
            if(leftIndex < mid){
                leftArr[leftIndex] = itemSort[leftIndex];
            }else{
                rightArr[rightIndex] = itemSort[leftIndex];
                rightIndex++;
            }
        }

        shubaSort(leftArr);
        shubaSort(rightArr);
        shubaSortHelper(leftArr, rightArr, itemSort);

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
    //-> This expands the array.
    @SuppressWarnings("unchecked")
    private void expandArray() {
        Item[] tempDatas = datas;

        datas = (Item[]) new Object[datas.length * 2];

        for (int i = 0; i < sizeShuba(); i++) {
            datas[i] = tempDatas[i];
        }

    }
    //-> Sorts an array (Uses Merge Sorting O(n log n))
    private void shubaSortHelper(int[] leftArr, int[] rightArr, int[] origArr){

        int length = origArr.length;

        int leftSize = length / 2;
        int rightSize = length - leftSize;

        int leftIndex = 0, rightIndex = 0, origIndex = 0;

        while(leftIndex < leftSize && rightIndex < rightSize){
            if(leftArr[leftIndex] < rightArr[rightIndex]){
                origArr[origIndex] = leftArr[leftIndex];
                leftIndex++;
                origIndex++;
            }else{
                origArr[origIndex] = rightArr[rightIndex];
                rightIndex++;
                origIndex++;
            }
        }
        while (leftIndex < leftSize){
            origArr[origIndex] = leftArr[leftIndex];
            leftIndex++;
            origIndex++;
        }
        while (rightIndex < rightSize){
            origArr[origIndex] = rightArr[rightIndex];
            rightIndex++;
            origIndex++;
        }

    }

}//end of class

//LEARNINGS:
// Casting = pretending something is a type (only works if compatible)
// Generic Types <> = Exists only in compile time, not in runtime.
// Using new Object[10] + (Item[]) in the constructor sets up your array properly
// Non-Static: Object level, unique per object ; Static: Class level, shares the same values.
// null is no value "marker" for every object -- default empty value


