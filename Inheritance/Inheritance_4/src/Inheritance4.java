class Truck extends  Vehicle{

    private double cargoCapacity;
    public Truck(String model, int year, String fuel, String make, double fuelEfficiently, double cargoCapacity) {
        super(model, year, fuel, make, fuelEfficiently);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public double fuelEfficiently(){
        return getFuelEfficiently()*(1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }

    @Override
    public int maximumSpeed(){
        if(getFuel() == "Diesel"){
            int maxSpeed = 128;
            return maxSpeed;
        }
        else if(getFuel() == "Benzin"){
            int maxSpeed = 90;
            return maxSpeed;
        }
        return 0;
    }

    @Override
    public double distanceTraveled(){
        return fuelEfficiently()*getFuelEfficiently();
    }
}

class Car extends  Vehicle{

    private int numSeats;

    public Car(String model, int year, String fuel, String make, double fuelEfficiently, int numSeats) {
        super(model, year, fuel, make, fuelEfficiently);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    @Override
    public double fuelEfficiently() {

        return getFuelEfficiently() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
    }

    @Override
    public int maximumSpeed(){
        if(getFuel() == "Diesel"){
            int maxSpeed = 228;
            return maxSpeed;
        }
        else if(getFuel() == "Benzin"){
            int maxSpeed = 189;
            return maxSpeed;
        }
        return 0;
    }

    @Override
    public double distanceTraveled(){
        return fuelEfficiently()*getFuelEfficiently();
    }
}

class Motorcyle extends  Vehicle{

    private double engineDisplacement;
    public Motorcyle(String model, int year, String fuel, String make, double fuelEfficiently, double engineDisplacement) {
        super(model, year, fuel, make, fuelEfficiently);
        this.engineDisplacement = engineDisplacement;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public double fuelEfficiently() {

        return getFuelEfficiently() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
    }

    @Override
    public int maximumSpeed(){
        if(getFuel() == "Diesel"){
            int maxSpeed = 228;
            return maxSpeed;
        }
        else if(getFuel() == "Benzin"){
            int maxSpeed = 189;
            return maxSpeed;
        }
        return 0;
    }

    @Override
    public double distanceTraveled(){
        return fuelEfficiently()*getFuelEfficiently();
    }
}



public class Inheritance4 {
    public static void main(String[] args) {

        Car car1 = new Car("240M", 2010, "Benzin", "Honda", 6.123, 4);
        System.out.println(car1.distanceTraveled());
        System.out.println(car1.maximumSpeed());
        System.out.println(car1.fuelEfficiently());
    }
}