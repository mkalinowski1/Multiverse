import static org.junit.Assert.*;
import org.junit.Test;

public class ParserTest {

    @Test
    public void validDimmenstionsInput() throws Exception {
        final int[] dimensions = Parser.parseDimensions("4 5");
        assertNotNull(dimensions);
        assertEquals(2, dimensions.length);
        assertEquals(4, dimensions[0]);
        assertEquals(5, dimensions[1]);
    }

    @Test
    public void invalidDimmenstionsInput() {
        final Exception exception = assertThrows(Exception.class, () -> Parser.parseDimensions("4, 5"));
        assertEquals("Invalid Input: 4, 5", exception.getMessage());
    }

    @Test
    public void validWalkParametersInput() throws Exception {
        final WalkParameters walkParameters = Parser.parseWalkParameters("(1, 2, E) FF");
        assertNotNull(walkParameters);
        assertEquals(1, walkParameters.startX);
        assertEquals(2, walkParameters.startY);
        assertEquals('E', walkParameters.startOrientation);
        assertEquals("FF", walkParameters.moves);
    }

    @Test
    public void invalidWalkParametersInput() {
        final Exception exception = assertThrows(Exception.class, () -> Parser.parseDimensions("4, 5"));
        assertEquals("Invalid Input: 4, 5", exception.getMessage());
    }
};