class Vehicle {

    String model;

    Vehicle(String model) {
        this.model = model;
    }

    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {

    Car(String model) {
        super(model);
    }

    @Override
    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    Bus(String model) {
        super(model);
    }

    @Override
    double fuelCost(int km) {
        return km * 20;
    }
}

class Bike extends Vehicle {

    Bike(String model) {
        super(model);
    }

    @Override
    double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {

    ElectricCar(String model) {
        super(model);
    }

    @Override
    double fuelCost(int km) {
        return km * 1.5; // electricity cost
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("Honda City"),
                new Bus("Volvo"),
                new Bike("Apache"),
                new ElectricCar("Tesla")
        };

        int km = 100;

        for (Vehicle v : fleet) {

            System.out.println(v.model + " Fuel Cost = ₹" + v.fuelCost(km));

            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("This is a Car");
            }
            else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("This is a Bus");
            }
            else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("This is a Bike");
            }
            else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("This is an Electric Car");
            }

            System.out.println();
        }
    }
}