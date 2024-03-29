public class Main {
    public static void main(String[] args) {

        // Test 1
        System.out.println("Test 1");
        Grid grid0 = new Grid(5, 5);

        grid0.setObstacle(new Cell.Obstacle(2, 0));
        grid0.setObstacle(new Cell.Obstacle(2, 1));
        grid0.setObstacle(new Cell.Obstacle(2, 4));
        grid0.setObstacle(new Cell.Obstacle(4, 1));
        grid0.setObstacle(new Cell.Obstacle(4, 2));
        grid0.setObstacle(new Cell.Obstacle(3, 2));
        grid0.setObstacle(new Cell.Obstacle(3, 0));
        grid0.setObstacle(new Cell.Obstacle(1, 4));
        grid0.setObstacle(new Cell.Obstacle(1, 3));

        grid0.setRobot(new Cell.Robot(4,0));
        grid0.setGoal(new Cell.Goal(0,4));
        grid0.display();

        System.out.println();

        grid0.shortestPath();
        System.out.println();
        System.out.println();

        // Test 2
        System.out.println("Test 2");
        Grid grid1 = new Grid(8, 8);

        grid1.setObstacle(new Cell.Obstacle(2, 0));
        grid1.setObstacle(new Cell.Obstacle(2, 1));
        grid1.setObstacle(new Cell.Obstacle(2, 4));
        grid1.setObstacle(new Cell.Obstacle(4, 1));
        grid1.setObstacle(new Cell.Obstacle(4, 2));
        grid1.setObstacle(new Cell.Obstacle(3, 2));
        grid1.setObstacle(new Cell.Obstacle(3, 0));
        grid1.setObstacle(new Cell.Obstacle(1, 4));
        grid1.setObstacle(new Cell.Obstacle(1, 3));
        grid1.setObstacle(new Cell.Obstacle(5, 5));
        grid1.setObstacle(new Cell.Obstacle(6, 6));
        grid1.setObstacle(new Cell.Obstacle(7, 7));

        grid1.setRobot(new Cell.Robot(7, 0));
        grid1.setGoal(new Cell.Goal(0, 7));
        grid1.display();
        
        System.out.println();

        grid1.shortestPath();
        System.out.println();
        System.out.println();

        // Test 3
        System.out.println("Test 3");
        Grid grid2 = new Grid(10, 10);

        grid2.setObstacle(new Cell.Obstacle(1, 1));
        grid2.setObstacle(new Cell.Obstacle(2, 2));
        grid2.setObstacle(new Cell.Obstacle(3, 3));
        grid2.setObstacle(new Cell.Obstacle(4, 4));
        grid2.setObstacle(new Cell.Obstacle(5, 5));
        grid2.setObstacle(new Cell.Obstacle(6, 6));
        grid2.setObstacle(new Cell.Obstacle(7, 7));
        grid2.setObstacle(new Cell.Obstacle(8, 8));

        grid2.setRobot(new Cell.Robot(0, 0));
        grid2.setGoal(new Cell.Goal(9, 9));
        grid2.display();
        
        System.out.println();

        grid2.shortestPath();
        System.out.println();
        System.out.println();

        // Test 4
        System.out.println("Test 4");
        Grid grid3 = new Grid(6, 12);

        grid3.setObstacle(new Cell.Obstacle(1, 1));
        grid3.setObstacle(new Cell.Obstacle(1, 2));
        grid3.setObstacle(new Cell.Obstacle(2, 1));
        grid3.setObstacle(new Cell.Obstacle(2, 2));
        grid3.setObstacle(new Cell.Obstacle(3, 3));
        grid3.setObstacle(new Cell.Obstacle(3, 4));
        grid3.setObstacle(new Cell.Obstacle(4, 3));
        grid3.setObstacle(new Cell.Obstacle(4, 4));
        grid3.setObstacle(new Cell.Obstacle(5, 5));

        grid3.setRobot(new Cell.Robot(5, 0));
        grid3.setGoal(new Cell.Goal(0, 11));
        grid3.display();
        
        System.out.println();

        grid3.shortestPath();
        System.out.println();
        System.out.println();

        // Test 5
        System.out.println("Test 5");
        Grid grid4 = new Grid(15, 15);

        grid4.setObstacle(new Cell.Obstacle(1, 1));
        grid4.setObstacle(new Cell.Obstacle(1, 2));
        grid4.setObstacle(new Cell.Obstacle(2, 1));
        grid4.setObstacle(new Cell.Obstacle(2, 2));
        grid4.setObstacle(new Cell.Obstacle(3, 3));
        grid4.setObstacle(new Cell.Obstacle(3, 4));
        grid4.setObstacle(new Cell.Obstacle(4, 3));
        grid4.setObstacle(new Cell.Obstacle(4, 4));
        grid4.setObstacle(new Cell.Obstacle(5, 5));
        grid4.setObstacle(new Cell.Obstacle(6, 6));
        grid4.setObstacle(new Cell.Obstacle(7, 7));
        grid4.setObstacle(new Cell.Obstacle(8, 8));
        grid4.setObstacle(new Cell.Obstacle(9, 9));
        grid4.setObstacle(new Cell.Obstacle(10, 10));
        grid4.setObstacle(new Cell.Obstacle(11, 11));
        grid4.setObstacle(new Cell.Obstacle(12, 12));
        grid4.setObstacle(new Cell.Obstacle(13, 13));

        grid4.setObstacle(new Cell.Obstacle(0, 3));
        grid4.setObstacle(new Cell.Obstacle(1, 3));
        grid4.setObstacle(new Cell.Obstacle(2, 3));
        grid4.setObstacle(new Cell.Obstacle(3, 2));
        grid4.setObstacle(new Cell.Obstacle(4, 2));
        grid4.setObstacle(new Cell.Obstacle(5, 1));
        grid4.setObstacle(new Cell.Obstacle(6, 1));
        grid4.setObstacle(new Cell.Obstacle(7, 0));
        grid4.setObstacle(new Cell.Obstacle(8, 0));
        grid4.setObstacle(new Cell.Obstacle(9, 0));
        grid4.setObstacle(new Cell.Obstacle(10, 0));
        grid4.setObstacle(new Cell.Obstacle(11, 0));
        grid4.setObstacle(new Cell.Obstacle(12, 0));
        grid4.setObstacle(new Cell.Obstacle(13, 0));
        grid4.setObstacle(new Cell.Obstacle(14, 0));

        grid4.setObstacle(new Cell.Obstacle(0, 4));
        grid4.setObstacle(new Cell.Obstacle(0, 5));
        grid4.setObstacle(new Cell.Obstacle(0, 6));
        grid4.setObstacle(new Cell.Obstacle(0, 7));
        grid4.setObstacle(new Cell.Obstacle(0, 8));
        grid4.setObstacle(new Cell.Obstacle(0, 9));
        grid4.setObstacle(new Cell.Obstacle(0, 10));
        grid4.setObstacle(new Cell.Obstacle(0, 11));
        grid4.setObstacle(new Cell.Obstacle(0, 12));
        grid4.setObstacle(new Cell.Obstacle(0, 13));
        grid4.setObstacle(new Cell.Obstacle(0, 14));

        grid4.setObstacle(new Cell.Obstacle(1, 4));
        grid4.setObstacle(new Cell.Obstacle(1, 5));
        grid4.setObstacle(new Cell.Obstacle(1, 6));
        grid4.setObstacle(new Cell.Obstacle(1, 7));
        grid4.setObstacle(new Cell.Obstacle(1, 8));
        grid4.setObstacle(new Cell.Obstacle(1, 9));
        grid4.setObstacle(new Cell.Obstacle(1, 10));
        grid4.setObstacle(new Cell.Obstacle(1, 11));
        grid4.setObstacle(new Cell.Obstacle(1, 12));
        grid4.setObstacle(new Cell.Obstacle(1, 13));
        grid4.setObstacle(new Cell.Obstacle(1, 14));

        grid4.setObstacle(new Cell.Obstacle(2, 4));
        grid4.setObstacle(new Cell.Obstacle(2, 5));
        grid4.setObstacle(new Cell.Obstacle(2, 6));
        grid4.setObstacle(new Cell.Obstacle(2, 7));
        grid4.setObstacle(new Cell.Obstacle(2, 8));
        grid4.setObstacle(new Cell.Obstacle(2, 9));
        grid4.setObstacle(new Cell.Obstacle(2, 10));
        grid4.setObstacle(new Cell.Obstacle(2, 11));
        grid4.setObstacle(new Cell.Obstacle(2, 12));
        grid4.setObstacle(new Cell.Obstacle(2, 13));
        grid4.setObstacle(new Cell.Obstacle(2, 14));

        grid4.setRobot(new Cell.Robot(14, 14));
        grid4.setGoal(new Cell.Goal(0, 0));
        grid4.display();

        System.out.println();

        grid4.shortestPath();
        System.out.println();
        System.out.println();

        // Test 6 - no path
        System.out.println("Test 6 No path");
        Grid grid5 = new Grid(5, 5);

        grid5.setObstacle(new Cell.Obstacle(3, 0));
        grid5.setObstacle(new Cell.Obstacle(3, 1));
        grid5.setObstacle(new Cell.Obstacle(4, 1));

        grid5.setRobot(new Cell.Robot(4, 0));
        grid5.setGoal(new Cell.Goal(0, 4));
        grid5.display();

        System.out.println();

        grid5.shortestPath();
        System.out.println();
        System.out.println();

        System.out.println("Test 7 1000 1000");
        Grid grid6 = new Grid(1000, 1000);
        grid6.setGoal(new Cell.Goal(999, 999));
        grid6.setRobot(new Cell.Robot(0, 0));
        grid6.shortestPath();

        System.out.println("Test 8");
        Grid grid7 = new Grid(10, 10);
        grid7.setGoal(new Cell.Goal(1, 4));
        grid7.setRobot(new Cell.Robot(8, 5));

        grid7.setObstacle(new Cell.Obstacle(2, 1));
        grid7.setObstacle(new Cell.Obstacle(2, 2));
        grid7.setObstacle(new Cell.Obstacle(2, 3));
        grid7.setObstacle(new Cell.Obstacle(2, 4));
        grid7.setObstacle(new Cell.Obstacle(2, 5));
        grid7.setObstacle(new Cell.Obstacle(2, 6));
        grid7.setObstacle(new Cell.Obstacle(2, 7));

        grid7.setObstacle(new Cell.Obstacle(3, 1));
        grid7.setObstacle(new Cell.Obstacle(3, 7));
        grid7.setObstacle(new Cell.Obstacle(4, 1));
        grid7.setObstacle(new Cell.Obstacle(4, 7));
        grid7.setObstacle(new Cell.Obstacle(5, 1));
        grid7.setObstacle(new Cell.Obstacle(5, 7));
        grid7.setObstacle(new Cell.Obstacle(6, 1));
        grid7.setObstacle(new Cell.Obstacle(6, 7));
        grid7.setObstacle(new Cell.Obstacle(7, 1));
        grid7.setObstacle(new Cell.Obstacle(7, 7));
        grid7.setObstacle(new Cell.Obstacle(8, 1));
        grid7.setObstacle(new Cell.Obstacle(8, 7));

        grid7.shortestPath();

    }
}