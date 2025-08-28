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



    }//end of clas

}//end of class