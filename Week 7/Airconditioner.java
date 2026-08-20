public class Airconditioner extends Appliance {
    public Airconditioner(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Cooling the room...");
    }
}