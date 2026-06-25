class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Name : " + memberName);
        System.out.println("ID   : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class Main {

    static void searchMember(LibraryMember[] members, String id) {

        for (LibraryMember m : members) {

            if (m.memberId.equals(id)) {

                System.out.println("\nMember Found");

                m.printDetails();

                return;
            }
        }

        System.out.println("\nMember Not Found");
    }

    public static void main(String[] args) {

        LibraryMember[] members = {

                new StudentMember("Ishika", "S101"),
                new FacultyMember("Dr. Sharma", "F201"),
                new GuestMember("Rahul", "G301")
        };

        int overdueDays = 6;

        for (LibraryMember m : members) {

            m.printDetails();

            System.out.println("Fine = ₹" +
                    m.calculateFine(overdueDays));

            System.out.println();
        }

        searchMember(members, "F201");
    }
}