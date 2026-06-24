interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Activity data reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity logged.");
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness report generated.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Reminder: Complete your workout!");
    }
}

public class Main {
    public static void main(String[] args) {

        FitnessDevice fd = new FitnessDevice();

        fd.logActivity();
        fd.generateReport();
        fd.sendAlert();
        fd.resetData();
    }
}