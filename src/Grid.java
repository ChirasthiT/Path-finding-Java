import java.util.Arrays;
import java.util.Objects;

public class Grid {
    // Creating instance variables to store date
    private final Cell[][] grid;
    private boolean robotPlaced = false;
    private boolean goalPlaced = false;
    public boolean found  = false;
    private final int rows;
    private final int columns;
    private Cell.Robot robotLocation;
    private Cell.Goal goalLocation;
    private CustomArrayList obstacleLocations = new CustomArrayList();
    public CustomArrayList path;
    private CustomArrayList visited;

    // Constructor for the class Grid
    public Grid(int rows, int columns) {
        this.rows = rows; this.columns = columns;
        this.grid = new Cell[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = new Cell.NonObstacle(i, j);
            }
        }
    }

    // Display method for the grid
    public void display() {
        for (Cell[] arr:grid) {
            System.out.println(Arrays.toString(arr));
        }
    }

    // Setters for different types of cells
    public void setObstacle(Cell.Obstacle obstacle) {
        if (goalrobotLocationCheck(obstacle.x, obstacle.y)) {
            grid[obstacle.x][obstacle.y] = obstacle;
            obstacleLocations.add(obstacle);
        } else {
            System.out.println("Cannot Override Robot and Goal Locations");
        }
    }

    private void setNonObstacle(Cell.NonObstacleForRepresentation nonObstacle) {
        grid[nonObstacle.x][nonObstacle.y] = nonObstacle;
        obstacleLocations.add(nonObstacle);
    }

    private void setPath(int x, int y) {
        grid[x][y] = new Cell.Path(x, y);
    }

    private boolean goalrobotLocationCheck(int x, int y) {
        if (robotPlaced) {
            if (robotLocation.x == x && robotLocation.y == y) {
                return false;
            }
        }
        if (goalPlaced) {
            return goalLocation.x != x || goalLocation.y != y;
        }

        return true;
    }
    public void setRobot(Cell.Robot robot) {
        // Check if the robot is already placed and the position is valid
        if (!robotPlaced && gridCheck(robot.x, robot.y)) {
            grid[robot.x][robot.y] = robot;
            robotLocation = robot;
            robotPlaced = true;
        } else {
            System.out.println("Error placing the robot!");
        }
    }

    public void setGoal(Cell.Goal goal) {
        // Check if the goal is already placed and the position is valid
        if (!goalPlaced && gridCheck(goal.x, goal.y)) {
            grid[goal.x][goal.y] = goal;
            goalLocation = goal;
            goalPlaced = true;
        } else {
            System.out.println("Error placing the goal!");
        }
    }

    public void removeRobot() {
        if (robotPlaced) {
            grid[robotLocation.x][robotLocation.y] = new Cell.NonObstacle(robotLocation.x, robotLocation.y);
            robotPlaced = false;
        } else {
            System.out.println("Place the Robot First");
        }
    }

    public void removeGoal() {
        if (goalPlaced) {
            grid[goalLocation.x][goalLocation.y] = new Cell.NonObstacle(goalLocation.x, goalLocation.y);
            goalPlaced = false;
        } else {
            System.out.println("Place the Goal First");
        }
    }

    public boolean gridCheck(int x, int y) {
        // Checking the X and Y coordinates are valid
        if (x >= rows || x < 0) {
            return false;
        }
        return y < columns && y >= 0;
    }

    private CustomArrayList getNeighbours(int x, int y) {
        CustomArrayList neighbours = new CustomArrayList();

        // Getting neighbours for each cell via grid locations
        int[] xaxis = {1, -1 , 0, 0, 1, 1, -1, -1}; int[] yaxis = {0, 0, 1, -1, 1, -1, 1, -1};

        for (int i = 0; i < 8; i++) {
            // Setting the new X and Y positions
            int xNew = x + xaxis[i];
            int yNew = y + yaxis[i];

            if (gridCheck(xNew, yNew)) {
                neighbours.add(grid[xNew][yNew]);
            }
        }
        return neighbours;
    }

    public void shortestPath() {
        CustomArrayList open = new CustomArrayList();
        Map parents = new Map();
        visited = new CustomArrayList();

        long startTime = System.currentTimeMillis();

        // Checking if the goal and robot is placed
        if (robotPlaced && goalPlaced) {
            open.add(robotLocation);
            visited.add(robotLocation);
        } else {
            System.out.println("Add robot and goal first!");
            return;
        }

        while (open.size() > 0) {
            // Getting the firse element of the queue
            Cell current = open.get(0);

            for (int i = 0; i < open.size(); i++) {
                if (open.get(i).fCost() < current.fCost() || open.get(i).fCost() == current.fCost() && open.get(i).hCost < current.hCost) {
                    current = open.get(i);
                }
            }

            open.remove(current);
            visited.add(current);

            // Checking the current cells location is the goals location
            if (current == goalLocation) {
                constructPath(parents, current);
                found = true;
                long endTime = System.currentTimeMillis();
                System.out.println("\n" + "Execution Time : " + (endTime - startTime) + " ms");
                return;
            }

            // Getting neighbours of the current cell
            CustomArrayList neighbours = getNeighbours(current.x, current.y);

            for (int i = 0; i < neighbours.size(); i++) {
                Cell neighbour = neighbours.get(i);
                // Checking if the neighbour cell is already visited and not an Obstacle
                if (!visited.contains(neighbour) && !(Objects.equals(neighbour.typeOf(), "Obstacle"))) {
                    double newMovementCost = current.gCost + heuristic(neighbour, goalLocation);

                    if (!open.contains(neighbour) || newMovementCost < neighbour.gCost) {
                        neighbour.gCost = newMovementCost;
                        neighbour.hCost = heuristic(neighbour, goalLocation);
                        // Saving the neighbours parent as the current cell
                        parents.put(neighbour, current);
                        if (!open.contains(neighbour)) {
                            // Adding the neighbour cell to the queue and the visited array
                            open.add(neighbour);
                        }
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No path found!!" + "\n");
            long notFoundEndTime = System.currentTimeMillis();
            System.out.println("\n" + "Execution Time : " + (notFoundEndTime - startTime) + " ms");
        }
    }

    private void constructPath(Map parentMap, Cell goal) {
        path = new CustomArrayList();
        Cell current = goal;
        StringBuilder orientation = new StringBuilder();

        while (parentMap.containsKey(current)) {
            // Adding the cells of the path to path array
            path.add(current);
            // Making current the parent
            current = parentMap.get(current);
        }

        path.add(robotLocation);
        path = path.reverse();
        System.out.println("\n" + path + "\n" + "Total No of steps : " +  (path.size() - 1)  +"\n");

        Grid grid = new Grid(rows, columns);
        for (int i = 0; i < visited.size(); i++) {
            grid.setNonObstacle(new Cell.NonObstacleForRepresentation(visited.get(i).x, visited.get(i).y));
        }
        grid.setGoal(goalLocation);
        grid.setRobot(robotLocation);

        for (int i = 0; i < obstacleLocations.size(); i++) {
            Cell cell = obstacleLocations.get(i);
            grid.setObstacle((Cell.Obstacle) cell);
        }

        // Setting the path
        for (int i = 1; i < path.size()-1; i++) {
            Cell cell = path.get(i);
            grid.setPath(cell.x, cell.y);
        }

        grid.display();
        System.out.println();

        for (int i = 0; i < path.size()-1; i++) {
            orientation.append(getDirections(path.get(i), path.get(i + 1)));
        }
        orientation.append("Goal Reached!");
        System.out.println("Orientation" + "\n" + orientation + "\n");
    }

    private double heuristic(Cell from, Cell to) {
        int x = Math.abs(from.x - to.x);
        int y = Math.abs(from.y - to.y);
        if (x > y) {
            return  14*y + 10*(x-y);
        }
        return 14*x + 10*(y-x);
    }

    private String getDirections(Cell from, Cell to) {
        int x = to.x - from.x;
        int y = to.y - from.y;

        if (x == 0 && y == -1) return "left -> ";
        if (x == 0 && y == 1) return "right -> ";
        if (x == 1 && y == 0) return "down -> ";
        if (x == -1 && y == 0) return "up -> ";
        if (x == 1 && y == -1) return "lower left -> ";
        if (x == -1 && y == -1) return "upper left -> ";
        if (x == 1 && y == 1) return "lower right -> ";
        if (x == -1 && y == 1) return "upper right -> ";

        return "";
    }
}