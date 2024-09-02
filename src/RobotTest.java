import static org.junit.Assert.*;
import org.junit.Test;

public class RobotTest {

    // tests from assignment
    @Test
    public void assignmentExample1() throws Exception {
        final int[] dimensions = new int[] { 4, 8 };
        final WalkParameters walkParameters = new WalkParameters(2, 3, 'E', "LFRFF");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(4, 4, E)", response);
    }

    @Test
    public void assignmentExample2() throws Exception {
        final int[] dimensions = new int[] { 4, 8 };
        final WalkParameters walkParameters = new WalkParameters(0, 2, 'N', "FFLFRFFF");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(0, 4, W) LOST", response);
    }

    @Test
    public void assignmentExample3() throws Exception {
        final int[] dimensions = new int[] { 4, 8 };
        final WalkParameters walkParameters = new WalkParameters(2, 3, 'N', "FLLFR");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(2, 3, W)", response);
    }

    @Test
    public void assignmentExample4() throws Exception {
        final int[] dimensions = new int[] { 4, 8 };
        final WalkParameters walkParameters = new WalkParameters(1, 0, 'S', "FFRLF");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(1, 0, S) LOST", response);
    }

    // additional unit sets
    @Test
    public void validWalkOneStepE() throws Exception {
        final int[] dimensions = new int[] { 4, 5 };
        final WalkParameters walkParameters = new WalkParameters(1, 2, 'E', "F");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(2, 2, E)", response);
    }

    @Test
    public void validWalkOneStepW() throws Exception {
        final int[] dimensions = new int[] { 4, 5 };
        final WalkParameters walkParameters = new WalkParameters(1, 2, 'W', "F");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(0, 2, W)", response);
    }

    @Test
    public void validWalkOneStepS() throws Exception {
        final int[] dimensions = new int[] { 4, 5 };
        final WalkParameters walkParameters = new WalkParameters(1, 2, 'S', "F");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(1, 1, S)", response);
    }

    @Test
    public void validWalkOneStepN() throws Exception {
        final int[] dimensions = new int[] { 4, 5 };
        final WalkParameters walkParameters = new WalkParameters(1, 2, 'N', "F");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(1, 3, N)", response);
    }

    @Test
    public void validWalkRotateL() throws Exception {
        final int[] dimensions = new int[] { 4, 5 };
        final WalkParameters walkParameters = new WalkParameters(1, 2, 'N', "L");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(1, 2, W)", response);
    }

    @Test
    public void validWalkRotateR() throws Exception {
        final int[] dimensions = new int[] { 4, 5 };
        final WalkParameters walkParameters = new WalkParameters(1, 2, 'N', "R");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(1, 2, E)", response);
    }

    @Test
    public void lostWalktoE() throws Exception {
        final int[] dimensions = new int[] { 4, 5 };
        final WalkParameters walkParameters = new WalkParameters(3, 2, 'E', "FF");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(4, 2, E) LOST", response);
    }

    @Test
    public void lostWalktoE2() throws Exception {
        final int[] dimensions = new int[] { 4, 5 };
        final WalkParameters walkParameters = new WalkParameters(2, 2, 'E', "FFF");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(4, 2, E) LOST", response);
    }

    @Test
    public void lostWalktoW() throws Exception {
        final int[] dimensions = new int[] { 4, 5 };
        final WalkParameters walkParameters = new WalkParameters(2, 2, 'W', "FFF");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(0, 2, W) LOST", response);
    }

    @Test
    public void lostWalktoN() throws Exception {
        final int[] dimensions = new int[] { 4, 5 };
        final WalkParameters walkParameters = new WalkParameters(3, 2, 'E', "LFFFF");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(3, 5, N) LOST", response);
    }

    @Test
    public void lostWalktoS() throws Exception {
        final int[] dimensions = new int[] { 4, 5 };
        final WalkParameters walkParameters = new WalkParameters(2, 2, 'E', "RFFFF");
        final String response = Robot.walk(walkParameters, dimensions);
        assertNotNull(response);
        assertEquals("(2, 0, S) LOST", response);
    }

};