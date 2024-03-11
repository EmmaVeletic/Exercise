public abstract class Vehicle {
    private String model;
    private int year;

    private String fuel;
    private String make;

    private double fuelEfficiently;

    public Vehicle(String model, int year, String fuel, String make, double fuelEfficiently) {
        this.model = model;
        this.year = year;
        this.fuel = fuel;
        this.make = make;
        this.fuelEfficiently = fuelEfficiently;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuel() {
        return fuel;
    }

    public String getMake() {
        return make;
    }

    public double getFuelEfficiently() {
        return fuelEfficiently;
    }

    public abstract int maximumSpeed();

    public abstract double fuelEfficiently();

    public abstract double distanceTraveled();
}
