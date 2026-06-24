interface TextModeration {

    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No abusive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("hate")
                || post.toLowerCase().contains("abuse");
    }
}

interface SpamDetection {

    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("No spam content allowed.");
    }
}

class ContentModerator
        implements TextModeration, SpamDetection {

    @Override
    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean isSpam(String post) {
        return post.toLowerCase().contains("buy now")
                || post.toLowerCase().contains("click here");
    }

    // Resolving default method conflict
    @Override
    public void displayModerationPolicy() {
        System.out.println(
                "Policy: No spam and no offensive content."
        );
    }
}

public class Main {
    public static void main(String[] args) {

        String[] posts = {
                "Buy now and get 50% off",
                "I hate this product",
                "Welcome to our community",
                "Click here to earn money"
        };

        ContentModerator cm = new ContentModerator();

        cm.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            if (cm.isSpam(post)) {
                System.out.println("\"" + post + "\" -> Spam Post");
            }
            else if (cm.isOffensive(post)) {
                System.out.println("\"" + post + "\" -> Offensive Post");
            }
            else {
                System.out.println("\"" + post + "\" -> Valid Post");
            }
        }
    }
}