import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        // Create a ConcurrentHashMap instance
        ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();

        // Create and start multiple threads to increment scores concurrently
        Thread thread1 = new Thread(new ScoreUpdater(scores, "Alice"));
        Thread thread2 = new Thread(new ScoreUpdater(scores, "Bob"));
        Thread thread3 = new Thread(new ScoreUpdater(scores, "Charlie"));

        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final scores
        System.out.println("Final scores:");
        scores.forEach((name, score) -> System.out.println(name + ": " + score));
    }

    // Runnable task to update scores concurrently
    static class ScoreUpdater implements Runnable {
        private ConcurrentHashMap<String, Integer> scores;
        private String playerName;

        public ScoreUpdater(ConcurrentHashMap<String, Integer> scores, String playerName) {
            this.scores = scores;
            this.playerName = playerName;
        }

        @Override
        public void run() {
            // Increment the player's score
            for (int i = 0; i < 10000; i++) {
                scores.compute(playerName, (name, score) -> (score == null) ? 1 : score + 1);
            }
        }
    }
}