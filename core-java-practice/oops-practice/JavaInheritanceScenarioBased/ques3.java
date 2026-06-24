interface StreamingService {
    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {
    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie() {
        System.out.println("Streaming movie...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing game...");
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        System.out.println("Streaming and Gaming subscriptions active.");
    }
}

public class Main {
    public static void main(String[] args) {

        String[] movies = {
                "Avatar",
                "Inception",
                "Interstellar"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "GTA V"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies Available:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nGames Available:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}