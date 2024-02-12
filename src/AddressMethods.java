public class AddressMethods {
    public static void main(String[] args){

        //System.out.println("Kota Puppycat");
        displayAddressOne("Kota Puppycat");
        System.out.println("-------------------");
        //System.out.println("KotaKatTechs");
        displayAddressTwo("KotaKatTechs");

        //call cG Method
        System.out.println("-------------------");
        System.out.println("-------------------");
        calculateGross(75.47);
    }//Main Method End
    public static void displayAddressOne(String userName){//  Header
        System.out.println("\u001B[38;5;106m" + "To: " + userName);//       \
        System.out.println("\u001B[38;5;142m" + "110 N. Joshua's way");//    |-- BODY
        System.out.println("\u001B[38;5;178m" + "Yorktown, Va 23692");//    /
    }//End dAO method
    public static void displayAddressTwo(String userName) {
        System.out.println("\u001B[38;5;153m" + "To: " + userName);
        System.out.println("\u001B[38;5;189m" + "3276 Spring View Dr");
        System.out.println("\u001B[38;5;225m" + "Christiansburg, Va 24073");
    }//END dAT method

    public static void calculateGross(double hours) {
        final double STD_RATE = 16.00;
        final double TAX_RATE = .166;
        double gross;
        gross = (hours * STD_RATE);
        double tax;
        tax = gross * TAX_RATE;
        double net;
        net = gross - tax;
        System.out.println("\u001B[38;5;196m" + hours + " hours at $" + STD_RATE + " per hours is $" + gross);

        System.out.println("\u001B[35" + "Your take home amount is $" + net);
    }//END cG method
}//END Class

///ACCESS SPECIFIERS: PUBLIC, PRIVATE, PROTECTED, or PACKAGE
///
