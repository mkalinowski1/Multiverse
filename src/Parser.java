import java.util.regex.*;

class Parser {

    static Pattern dimensionsPattern = Pattern.compile("^(\\d+) (\\d+)$");
    static Pattern robotPattern = Pattern.compile("^\\((\\d+), (\\d+), ([EWNS])\\) ([LRF]+)$");

    public static int[] parseDimensions(String line) throws Exception {
        Matcher dimensionsMatcher = dimensionsPattern.matcher(line);
        if (!dimensionsMatcher.matches()) {
            throw new Exception("Invalid Input: " + line);
        }
        final int m;
        final int n;
        try {
            m = Integer.parseInt(dimensionsMatcher.group(1));
            n = Integer.parseInt(dimensionsMatcher.group(2));
        } catch (Exception e) {
            throw new Exception("Invalid Input: " + line + " " + e.getMessage());
        }
        return new int[] { m, n };
    }

    public static WalkParameters parseWalkParameters(String line) throws Exception {
        Matcher robotMatcher = robotPattern.matcher(line);
        final int startX;
        final int startY;
        final char startO;
        final String moves;
        if (!robotMatcher.matches()) {
            throw new Exception("Invalid Input: " + line);
        }

        try {
            startX = Integer.parseInt(robotMatcher.group(1));
            startY = Integer.parseInt(robotMatcher.group(2));
            startO = robotMatcher.group(3).charAt(0);
            moves = robotMatcher.group(4);

            return new WalkParameters(startX, startY, startO, moves);
        } catch (Exception e) {
            throw new Exception("Invalid Input: " + line + " " + e.getMessage());
        }
    }
};