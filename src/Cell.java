public class Cell {
    int x, y;
    double gCost, hCost;


    public Cell(int row, int column) {
        this.x = row;
        this.y = column;
        gCost = Double.POSITIVE_INFINITY; // to initialize that these cells have not yet been reached from the starting point
        hCost = 0;
    }

    public double fCost() {
        return gCost + hCost;
    }

    @Override
    public String toString() {
        return null;
    }

    public String typeOf() {
        return null;
    }

    public static class NonObstacle extends Cell {
        public NonObstacle(int row, int column) {
            super(row, column);
        }

        @Override
        public String toString() {
            return "O";
        }

        @Override
        public String typeOf() {
            return "NonObstacle";
        }
    }

    public static class Obstacle extends Cell {
        public Obstacle(int row, int column) {
            super(row, column);
        }

        @Override
        public String toString() {
            return "X";
        }

        @Override
        public String typeOf() {
            return "Obstacle";
        }
    }

    public static class Robot extends Cell {
        public Robot(int row, int column) {
            super(row, column);
        }

        @Override
        public String toString() {
            return "R";
        }
    }

    public static class Goal extends Cell {
        public Goal(int row, int column) {
            super(row, column);
        }

        @Override
        public String toString() {
            return "G";
        }
    }

    protected static class Path extends Cell {
        public Path(int row, int column) {
            super(row, column);
        }

        @Override
        public String toString() {
            return "P";
        }
    }

    protected static class NonObstacleForRepresentation extends Cell {
        public NonObstacleForRepresentation(int row, int column) {
            super(row, column);
        }
        @Override
        public String toString() {
            return ".";
        }
    }

    protected static class Visited extends Cell {
        public Visited(int row, int column) {
            super(row, column);
        }
        @Override
        public String toString() {
            return "V";
        }
    }

}
