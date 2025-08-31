public class Main {
    public static void main(String[] args) {
        // Testing and Debugging!

        ShubaList<String> shuba = new ShubaList<>();

        System.out.println("My Very First Data Structure!");

        shuba.addShuba("Pikamee");
        shuba.addShuba("Subaru");
        shuba.addShuba("Korone");
        shuba.addShuba("Okayu");
        shuba.addShuba("Gura");

        for (int i = 0; i < shuba.sizeShuba(); i++) {
            System.out.println(shuba.getShuba(i));
        }

        shuba.removeShuba(2);
        System.out.println();

        for (int i = 0; i < shuba.sizeShuba() ; i++) {
            System.out.println(shuba.getShuba(i));
        }

        shuba.setShuba(0, "Lebron James");
        System.out.println();

        int counter = 0;
        while (counter < shuba.sizeShuba()){
            System.out.println(shuba.getShuba(counter));
            counter++;
        }
        System.out.println();//Spacing

        //--> This time using integer for ShubaList
        ShubaList<Integer> shubaInt = new ShubaList<>();
        int[] arr = new int[]{5,2,6,1,3,4};

        for (int i = 0; i < arr.length; i++) {
            shubaInt.addShuba(arr[i]);
        }

        for (int i = 0; i < shubaInt.sizeShuba(); i++) {
            System.out.print(shubaInt.getShuba(i) + " ");
        }

        System.out.println();//Spacing

        //Applies sorting algorithm of my ShubaList.
        shubaInt.shubaSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }//end of clas

}//end of class