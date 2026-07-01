import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<>();
        HashMap<String, Contact> map = new HashMap<>();
        HashSet<String> phoneSet = new HashSet<>();

        addContact("Ishika", "9876543210", "ishika@gmail.com",
                contacts, map, phoneSet);

        addContact("Rahul", "9123456789", "rahul@gmail.com",
                contacts, map, phoneSet);

        addContact("Ishika2", "9876543210", "abc@gmail.com",
                contacts, map, phoneSet); // Duplicate phone

        searchContact("Rahul", map);

        deleteContact("Rahul", contacts, map, phoneSet);

        displayContacts(contacts);
    }

    static void addContact(String name, String phone, String email,
                           ArrayList<Contact> contacts,
                           HashMap<String, Contact> map,
                           HashSet<String> phoneSet) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number!");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);
    }

    static void searchContact(String name,
                              HashMap<String, Contact> map) {

        if (map.containsKey(name)) {
            Contact c = map.get(name);

            System.out.println("Found: " +
                    c.name + " " +
                    c.phone + " " +
                    c.email);
        }
    }

    static void deleteContact(String name,
                              ArrayList<Contact> contacts,
                              HashMap<String, Contact> map,
                              HashSet<String> phoneSet) {

        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
        }
    }

    static void displayContacts(ArrayList<Contact> contacts) {

        Collections.sort(contacts,
                (a, b) -> a.name.compareTo(b.name));

        System.out.println("\nContacts");

        for (Contact c : contacts) {
            System.out.println(c.name + " "
                    + c.phone + " "
                    + c.email);
        }
    }
}