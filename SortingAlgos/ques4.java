import java.util.*;

class Employee {

    int id;
    int attendance;

    Employee(int id, int attendance) {
        this.id = id;
        this.attendance = attendance;
    }
}

public class Main {

    public static int[] topKEmployees(int[] employeeIds,
                                      int[] attendance,
                                      int k) {

        ArrayList<Employee> list = new ArrayList<>();

        for (int i = 0; i < employeeIds.length; i++) {
            list.add(new Employee(employeeIds[i], attendance[i]));
        }

        Collections.sort(list, (a, b) -> {

            if (a.attendance != b.attendance)
                return b.attendance - a.attendance; // Higher attendance first

            return a.id - b.id; // Smaller ID first
        });

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).id;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};
        int k = 3;

        System.out.println(Arrays.toString(
                topKEmployees(employeeIds, attendance, k)));
    }
}