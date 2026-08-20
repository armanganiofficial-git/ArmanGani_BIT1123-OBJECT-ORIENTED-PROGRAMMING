public class Washingmachine extends Appliance {
    public Washingmachine(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Washing clothes...");
    }
}