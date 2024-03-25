import java.util.Scanner;

public class UI {
    static Grid grid;
    static Scanner scanner = new Scanner(System.in);
    static boolean running = true;
    private static void switching(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Rows : ");
                int rows = scanner.nextInt();
                System.out.print("Columns : ");
                int columns = scanner.nextInt();
                grid = new Grid(rows, columns);
                System.out.println("Grid is set" + "\n");
                grid.display();
                System.out.println();
                break;

            case 2:
                if (grid != null) {
                    System.out.print("Rows : ");
                    int row = scanner.nextInt();
                    System.out.print("Columns : ");
                    int column = scanner.nextInt();
                    grid.setObstacle(new Cell.Obstacle(row, column));
                    System.out.println("Obstacle Set" + "\n");
                    grid.display();
                    System.out.println();
                } break;

            case 3:
                if (grid != null) {
                    System.out.print("Rows : ");
                    int rowR = scanner.nextInt();
                    System.out.print("Columns : ");
                    int columnR = scanner.nextInt();
                    grid.setRobot(new Cell.Robot(rowR, columnR));
                    System.out.println("Robot Set" + "\n");
                    grid.display();
                    System.out.println();
                } break;

            case 4:
                if (grid != null) {
                    System.out.print("Rows : ");
                    int rowG = scanner.nextInt();
                    System.out.print("Columns : ");
                    int columnG = scanner.nextInt();
                    grid.setGoal(new Cell.Goal(rowG, columnG));
                    System.out.println("Goal Set" + "\n");
                    grid.display();
                    System.out.println();
                } break;

            case 5:
                if (grid != null) {
                    grid.display();
                    System.out.println();
                    grid.shortestPath();
                    System.out.println();
                } break;

            case 6:
                running = false;
                System.exit(1);
                break;

            default:
                System.out.println("Enter a valid input!!");
        }
    }
    public static void main(String[] args) {
        while (running) {
            System.out.println("Enter 1 to set the grid");
            System.out.println("Enter 2 to add an Obstacle");
            System.out.println("Enter 3 to set the Robot");
            System.out.println("Enter 4 to set the Goal");
            System.out.println("Enter 5 to Search for the shortest path");
            System.out.println("Enter 6 to exit");
            System.out.println("To reset Enter 1 again!!" + "\n");

            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            switching(choice);
        }
    }
}
