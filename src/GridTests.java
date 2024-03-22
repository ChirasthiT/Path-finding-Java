import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridTests {
    @Test
    public void test1() {
        Grid grid = new Grid(5, 5);

        grid.setObstacle(new Cell.Obstacle(2, 0));
        grid.setObstacle(new Cell.Obstacle(2, 1));
        grid.setObstacle(new Cell.Obstacle(2, 4));
        grid.setObstacle(new Cell.Obstacle(4, 1));
        grid.setObstacle(new Cell.Obstacle(4, 2));
        grid.setObstacle(new Cell.Obstacle(3, 2));
        grid.setObstacle(new Cell.Obstacle(3, 0));
        grid.setObstacle(new Cell.Obstacle(1, 4));
        grid.setObstacle(new Cell.Obstacle(1, 3));

        grid.setRobot(new Cell.Robot(4,0));
        grid.setGoal(new Cell.Goal(0,4));
        grid.display();

        grid.shortestPath();

        assertTrue(grid.found);
    }

    @Test
    public void test2() {
        Grid grid = new Grid(8, 8);

        grid.setObstacle(new Cell.Obstacle(2, 0));
        grid.setObstacle(new Cell.Obstacle(2, 1));
        grid.setObstacle(new Cell.Obstacle(2, 4));
        grid.setObstacle(new Cell.Obstacle(4, 1));
        grid.setObstacle(new Cell.Obstacle(4, 2));
        grid.setObstacle(new Cell.Obstacle(3, 2));
        grid.setObstacle(new Cell.Obstacle(3, 0));
        grid.setObstacle(new Cell.Obstacle(1, 4));
        grid.setObstacle(new Cell.Obstacle(1, 3));
        grid.setObstacle(new Cell.Obstacle(5, 5));
        grid.setObstacle(new Cell.Obstacle(6, 6));
        grid.setObstacle(new Cell.Obstacle(7, 7));
        grid.setObstacle(new Cell.Obstacle(0, 7));

        grid.setRobot(new Cell.Robot(7, 0));
        grid.setGoal(new Cell.Goal(0, 7));
        grid.display();

        grid.shortestPath();

        assertTrue(grid.found);
    }

    @Test
    public void test3() {
        Grid grid = new Grid(10, 10);

        grid.setObstacle(new Cell.Obstacle(0, 0));
        grid.setObstacle(new Cell.Obstacle(1, 1));
        grid.setObstacle(new Cell.Obstacle(2, 2));
        grid.setObstacle(new Cell.Obstacle(3, 3));
        grid.setObstacle(new Cell.Obstacle(4, 4));
        grid.setObstacle(new Cell.Obstacle(5, 5));
        grid.setObstacle(new Cell.Obstacle(6, 6));
        grid.setObstacle(new Cell.Obstacle(7, 7));
        grid.setObstacle(new Cell.Obstacle(8, 8));
        grid.setObstacle(new Cell.Obstacle(9, 9));

        grid.setRobot(new Cell.Robot(0, 0));
        grid.setGoal(new Cell.Goal(9, 9));
        grid.display();

        grid.shortestPath();

        assertTrue(grid.found);
    }

    @Test
    public void test4() {
        Grid grid = new Grid(6, 12);

        grid.setObstacle(new Cell.Obstacle(1, 1));
        grid.setObstacle(new Cell.Obstacle(1, 2));
        grid.setObstacle(new Cell.Obstacle(2, 1));
        grid.setObstacle(new Cell.Obstacle(2, 2));
        grid.setObstacle(new Cell.Obstacle(3, 3));
        grid.setObstacle(new Cell.Obstacle(3, 4));
        grid.setObstacle(new Cell.Obstacle(4, 3));
        grid.setObstacle(new Cell.Obstacle(4, 4));
        grid.setObstacle(new Cell.Obstacle(5, 5));

        grid.setRobot(new Cell.Robot(5, 0));
        grid.setGoal(new Cell.Goal(0, 11));
        grid.display();

        grid.shortestPath();

        assertTrue(grid.found);
    }

    @Test
    public void test5() {
        Grid grid = new Grid(5, 5);

        grid.setObstacle(new Cell.Obstacle(3, 0));
        grid.setObstacle(new Cell.Obstacle(3, 1));
        grid.setObstacle(new Cell.Obstacle(4, 1));

        grid.setRobot(new Cell.Robot(4, 0));
        grid.setGoal(new Cell.Goal(0, 4));
        grid.display();

        grid.shortestPath();

        assertFalse(grid.found);
    }
}