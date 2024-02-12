public class AddressMethods {
    public static void main(String[] args){
        displayAddressOne("Kota Puppycat");
        System.out.println("-------------------");
        displayAddressTwo("KotaKatTechs");
    }
    public static void displayAddressOne(String userName){
        System.out.println("\u001B[34m" + "To: " + userName);
        System.out.println("\u001B[34m" + "110 N. Joshua's way");
        System.out.println("\u001B[34m" + "Yorktown, Va 23692");
    }
    public static void displayAddressTwo(String userName) {
        System.out.println("\u001B[35m" + "To: " + userName);
        System.out.println("\u001B[35m" + "3276 Spring View Dr");
        System.out.println("\u001B[35m" + "Christiansburg, Va 24073");
    }
}
