import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main m = new Main();

    @Test
    void should_CalculateDuplicateCharacters_When_MethodCalled() {
        //Given
        Map<Character, Integer> expectedMap = new HashMap<>();
        expectedMap.put('d', 2);
        expectedMap.put('e', 1);
        expectedMap.put('i', 1);
        expectedMap.put('m', 1);

        Map<Character, Integer> actualMap = new HashMap<>();
        //When
        actualMap =  m.calculateDuplicateCharacters("didem");;

        //Then
        assertEquals(expectedMap, actualMap);
    }
}