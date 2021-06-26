public class VehicleLoanInsurance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("BR01CV2518","Karizma ZMR","2-Wheeler",95000);
        System.out.println("Rs."+ v.takeInsurance());
        System.out.println("Rs."+ v.issueLoan());
    }
}
