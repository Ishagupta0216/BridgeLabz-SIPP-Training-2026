import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> attendance =
                new HashMap<>();

        markAttendance(attendance, "Java", "Ishika");
        markAttendance(attendance, "Java", "Rahul");
        markAttendance(attendance, "Python", "Ishika");
        markAttendance(attendance, "Java", "Ishika"); // Duplicate

        displayAttendance(attendance);
    }

    static void markAttendance(
            HashMap<String, ArrayList<String>> attendance,
            String subject,
            String student) {

        attendance.putIfAbsent(subject,
                new ArrayList<>());

        ArrayList<String> list =
                attendance.get(subject);

        if (!list.contains(student))
            list.add(student);
        else
            System.out.println(student +
                    " already marked present in " +
                    subject);
    }

    static void displayAttendance(
            HashMap<String, ArrayList<String>> attendance) {

        System.out.println();

        for (String subject : attendance.keySet()) {

            ArrayList<String> students =
                    attendance.get(subject);

            System.out.println(subject + " -> "
                    + students);

            System.out.println("Total Students = "
                    + students.size());

            System.out.println();
        }
    }
}