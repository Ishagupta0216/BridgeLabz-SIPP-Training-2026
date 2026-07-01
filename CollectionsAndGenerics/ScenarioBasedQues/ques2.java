import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> parking = new ArrayList<>();

        parking.add("UP85AB1234");
        parking.add("DL01XY7890");
        parking.add("HR26CD4567");

        parking.remove("DL01XY7890");

        String search = "HR26CD4567";

        if (parking.contains(search))
            System.out.println(search + " is parked.");
        else
            System.out.println(search + " not found.");

        System.out.println("\nParked Vehicles");

        for (String vehicle : parking)
            System.out.println(vehicle);

        System.out.println("Occupied Slots = " + parking.size());
    }
}