public class Main {
    public static void main(String[] args) {
        // Testing and Debugging!

        ShubaList<String> shuba = new ShubaList<>();

        System.out.println("My Very First Data Structure!");

        shuba.addShuba("Joshua");
        shuba.addShuba("Lebron");
        shuba.addShuba("James");
        shuba.addShuba("Shubaruu");

        for (int i = 0; i < shuba.sizeShuba(); i++) {
            System.out.println(shuba.getShuba(i));
        }
        shuba.removeShuba(3);

//        System.out.println(detector);
        System.out.println();//

        for (int i = 0; i < shuba.sizeShuba(); i++) {
            System.out.println(shuba.getShuba(i));
        }


    }//end of clas

}//end of class