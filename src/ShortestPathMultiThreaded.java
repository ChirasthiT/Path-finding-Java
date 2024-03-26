import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class ShortestPathMultiThreaded {
        private final Grid grid;
        private final ExecutorService executor;
        private final int numThreads;

        public ShortestPathMultiThreaded(Grid grid, int numThreads) {
            this.grid = grid;
            this.numThreads = numThreads;
            this.executor = Executors.newFixedThreadPool(numThreads);
        }

        public void findShortestPath() {
            // Divide the grid into sections or tasks
            // Submit each task to the ExecutorService
            // Each task will execute independently or explore different paths
            for (int i = 0; i < numThreads; i++) {
                // Execute shortest path algorithm for this task
                executor.submit(grid::shortestPath);
            }

            // Shutdown the executor once all tasks are completed
            executor.shutdown();
        }

        public static void main(String[] args) {
            // Example usage
            Grid grid = new Grid(1000, 1000);
            System.out.println("Test 7 1000 1000");
            grid.setGoal(new Cell.Goal(999, 999));
            grid.setRobot(new Cell.Robot(0, 0));
            int numThreads = Runtime.getRuntime().availableProcessors(); // Use available CPU cores
            ShortestPathMultiThreaded shortestPathMultiThreaded = new ShortestPathMultiThreaded(grid, numThreads);
            shortestPathMultiThreaded.findShortestPath();
        }

}
