class Robot {

    static int x;
    static int y;
    static char orientation;

    static String walk(final WalkParameters walkParameters, final int[] dimensions) {

        x = walkParameters.startX;
        y = walkParameters.startY;

        if (y >= dimensions[1] || x >= dimensions[0]) {
            return reportLost();
        }

        orientation = walkParameters.startOrientation;

        for (char move : walkParameters.moves.toCharArray()) {

            switch (move) {
                case 'L': // turn left
                    switch (orientation) {
                        case 'S':
                            orientation = 'E';
                            break;
                        case 'N':
                            orientation = 'W';
                            break;
                        case 'E':
                            orientation = 'N';
                            break;
                        case 'W':
                            orientation = 'S';
                            break;
                    }
                    break;

                case 'R': // turn right
                    switch (orientation) {
                        case 'S':
                            orientation = 'W';
                            break;
                        case 'N':
                            orientation = 'E';
                            break;
                        case 'E':
                            orientation = 'S';
                            break;
                        case 'W':
                            orientation = 'N';
                            break;
                    }
                    break;

                case 'F': // move forward
                    switch (orientation) {
                        case 'N':
                            if (y + 1 > dimensions[1]) {
                                return reportLost();
                            }
                            y++;
                            break;
                        case 'S':
                            if (y == 0) {
                                return reportLost();
                            }
                            y--;
                            break;
                        case 'E':
                            if (x + 1 > dimensions[0]) {
                                return reportLost();
                            }
                            x++;
                            break;
                        case 'W':
                            if (x == 0) {
                                return reportLost();
                            }
                            x--;
                            break;
                    }
                    break;
            }
        }

        return "(" + x + ", " + y + ", " + orientation + ")";
    }

    private static String reportLost() {
        return "(" + x + ", " + y + ", " + orientation + ") LOST";
    }
};