import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashSet<String> participants = new HashSet<>();

        register(participants, "ishika@gmail.com");
        register(participants, "rahul@gmail.com");
        register(participants, "ishika@gmail.com"); // duplicate

        System.out.println("\nRegistered Participants");

        for (String email : participants)
            System.out.println(email);

        System.out.println("Total Participants = "
                + participants.size());
    }

    static void register(HashSet<String> set,
                         String email) {

        if (set.add(email))
            System.out.println(email + " Registered");
        else
            System.out.println(email + " Duplicate Registration");
    }
}