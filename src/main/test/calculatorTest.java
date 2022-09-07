import model.calculator;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests written with cases retrieved from the following online calculator:
// https://www.convzone.com/decimal-to-quaternary/

class calculatorTest {
    // decToQuat() tests
    @Test
    void decToQuatRandomNumbers() {
        assertEquals(120, model.Calculator.toQuaternary(24));
        assertEquals(1121, model.Calculator.toQuaternary(89));
        assertEquals(30, model.Calculator.toQuaternary(12));
    }
    @Test
    void decToQuatEdgeCaseNumbers(){
        assertEquals(0, model.Calculator.toQuaternary(0));
        assertEquals(1, model.Calculator.toQuaternary(1));
        assertEquals(2, model.Calculator.toQuaternary(2));
        assertEquals(3, model.Calculator.toQuaternary(3));
        assertEquals(10, model.Calculator.toQuaternary(4));
    }
    @Test
    void decToQuatInvalidInputs(){
        assertNull(model.Calculator.toQuaternary(-1)); // assumes we want to return null for negative numbers
    }

    // quatToDec() tests
    @Test
    void quatToDecRandomNumbers() {
        assertEquals(55, model.Calculator.toDecimal(313));
        assertEquals(22, model.Calculator.toDecimal(112));
        assertEquals(101, model.Calculator.toDecimal(1211));
    }
    @Test
    void quatToDecEdgeCaseNumbers(){
        assertEquals(0, model.Calculator.toDecimal(0));
        assertEquals(1, model.Calculator.toDecimal(1));
        assertEquals(2, model.Calculator.toDecimal(2));
        assertEquals(3, model.Calculator.toDecimal(3));
        assertEquals(4, model.Calculator.toDecimal(10));
    }

    // conversion sanity test
    @Test
    void quatDecSanity(){
        var originalInput = 10;
        var temp = model.Calculator.toQuaternary(originalInput);
        var result = model.Calculator.toDecimal(temp);
        assertEquals(originalInput, result);
    }
}