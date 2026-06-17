public class MovieSeatReservation {

    int seats[] = {101, 102, 103, 104, 105};

    public int getSeat(int index) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid seat position requested.");
            return -1;
        }
    }

    public static void main(String[] args) {

        MovieSeatReservation movie = new MovieSeatReservation();

        int seat = movie.getSeat(8);

        if (seat != -1) {
            System.out.println("Seat Number: " + seat);
        } else {
            System.out.println("Seat could not be allocated.");
        }
    }
}