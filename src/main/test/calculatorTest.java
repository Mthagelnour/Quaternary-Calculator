import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests written with cases retrieved from the following online calculator:
// https://www.convzone.com/decimal-to-quaternary/

class calculatorTest {
    // decToQuat() tests
    @Test
    void decToQuatRandomNumbers() {
        assertEquals("120", model.calculator.decToQuat(24));
        assertEquals("1121", model.calculator.decToQuat(89));
        assertEquals("30", model.calculator.decToQuat(12));
    }
    @Test
    void decToQuatEdgeCaseNumbers(){
        assertEquals("0", model.calculator.decToQuat(0));
        assertEquals("1", model.calculator.decToQuat(1));
        assertEquals("2", model.calculator.decToQuat(2));
        assertEquals("3", model.calculator.decToQuat(3));
        assertEquals("10", model.calculator.decToQuat(4));
    }
    @Test
    void decToQuatInvalidInputs(){
        assertNull(model.calculator.decToQuat(-1)); // assumes we want to return null for negative numbers
    }

    // quatToDec() tests
    @Test
    void quatToDecRandomNumbers() {
        assertEquals(55, model.calculator.quatToDec("313"));
        assertEquals(22, model.calculator.quatToDec("112"));
        assertEquals(101, model.calculator.quatToDec("1211"));
    }
    @Test
    void quatToDecEdgeCaseNumbers(){
        assertEquals(0, model.calculator.quatToDec("0"));
        assertEquals(1, model.calculator.quatToDec("1"));
        assertEquals(2, model.calculator.quatToDec("2"));
        assertEquals(3, model.calculator.quatToDec("3"));
        assertEquals(4, model.calculator.quatToDec("10"));
    }

    // conversion sanity test
    @Test
    void quatDecSanity(){
        var originalInput = 10;
        var temp = model.calculator.decToQuat(originalInput);
        var result = model.calculator.quatToDec(temp);
        assertEquals(originalInput, result);
    }
}