class Move {
    public static void moveRobotX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    public static void moveRobotY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        moveRobotX(robot, toX);
        moveRobotY(robot, toY);
    }
}
//        // Variables to capture the need to move
//        boolean moveLeft = false;
//        boolean moveRight = false;
//        boolean moveUp = false;
//        boolean moveDown = false;
//
//        // Set movement requirements
//        if (robot.getX() < toX) {
//            moveRight = true;
//        }
//        if (robot.getX() > toX) {
//            moveLeft = true;
//        }
//        if (robot.getY() < toY) {
//            moveUp = true;
//        }
//        if (robot.getY() > toY) {
//            moveDown = true;
//        }
//
//        // Move Right Conditional: Orient the robot in the X direction and move to X destination
//        if (moveRight && "UP".equals(robot.getDirection().name())) {
//            robot.turnRight();
//            while (robot.getX() != toX) {
//                robot.stepForward();
//            }
//        } else if (moveRight && "LEFT".equals(robot.getDirection().name())) {
//            robot.turnRight();
//            robot.turnRight();
//            while (robot.getX() != toX) {
//                robot.stepForward();
//            }
//        } else if (moveRight && "DOWN".equals(robot.getDirection().name())) {
//            robot.turnLeft();
//            while (robot.getX() != toX) {
//                robot.stepForward();
//            }
//        } else if (moveRight && "RIGHT".equals(robot.getDirection().name())){
//            while (robot.getX() != toX) {
//                robot.stepForward();
//            }
//        }
//
//        // move Left Conditional: Orient the robot in the X direction and move to X destination
//        if (moveLeft && "UP".equals(robot.getDirection().name())) {
//            robot.turnLeft();
//            while (robot.getX() != toX) {
//                robot.stepForward();
//            }
//        } else if (moveLeft && "RIGHT".equals(robot.getDirection().name())) {
//            robot.turnRight();
//            robot.turnRight();
//            while (robot.getX() != toX) {
//                robot.stepForward();
//            }
//        } else if (moveLeft && "DOWN".equals(robot.getDirection().name())) {
//            robot.turnRight();
//            while (robot.getX() != toX) {
//                robot.stepForward();
//            }
//        } else if (moveLeft && "LEFT".equals(robot.getDirection().name())){
//            while (robot.getX() != toX) {
//                robot.stepForward();
//            }
//        }
//
//        // Move Up Conditional: Orient the robot in the Y direction and move to Y destination
//        if (moveUp && "RIGHT".equals(robot.getDirection().name())) {
//            robot.turnLeft();
//            while (robot.getY() != toY) {
//                robot.stepForward();
//            }
//        } else if (moveUp && "LEFT".equals(robot.getDirection().name())) {
//            robot.turnRight();
//            while (robot.getY() != toY) {
//                robot.stepForward();
//            }
//        } else if (moveUp && "DOWN".equals(robot.getDirection().name())) {
//            robot.turnRight();
//            robot.turnRight();
//            while (robot.getY() != toY) {
//                robot.stepForward();
//            }
//        } else if (moveUp && "UP".equals(robot.getDirection().name())){
//            while (robot.getY() != toY) {
//                robot.stepForward();
//            }
//        }
//
//        // Move Down Conditional: Orient the robot in the Y direction and move to Y destination
//        if (moveDown && "RIGHT".equals(robot.getDirection().name())) {
//            robot.turnRight();
//            while (robot.getY() != toY) {
//                robot.stepForward();
//            }
//        } else if (moveDown && "LEFT".equals(robot.getDirection().name())) {
//            robot.turnLeft();
//            while (robot.getY() != toY) {
//                robot.stepForward();
//            }
//        } else if (moveDown && "UP".equals(robot.getDirection().name())) {
//            robot.turnRight();
//            robot.turnRight();
//            while (robot.getY() != toY) {
//                robot.stepForward();
//            }
//        } else if (moveDown && "DOWN".equals(robot.getDirection().name())){
//            while (robot.getY() != toY) {
//                robot.stepForward();
//            }
//        }
//
//    }

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}