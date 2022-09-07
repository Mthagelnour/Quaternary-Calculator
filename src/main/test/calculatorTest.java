import model.calculator;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests written with cases retrieved from the following online calculator:
// https://www.convzone.com/decimal-to-quaternary/

class calculatorTest {
    // decToQuat() tests
    @Test
    void decToQuatRandomNumbers() {
        assertEquals(120, model.calculator.toQuaternary(24));
        assertEquals(1121, model.calculator.toQuaternary(89));
        assertEquals(30, model.calculator.toQuaternary(12));
    }
    @Test
    void decToQuatEdgeCaseNumbers(){
        assertEquals(0, calculator.toQuaternary(0));
        assertEquals(1, calculator.toQuaternary(1));
        assertEquals(2, calculator.toQuaternary(2));
        assertEquals(3, calculator.toQuaternary(3));
        assertEquals(10, calculator.toQuaternary(4));
    }
    @Test
    void decToQuatInvalidInputs(){
        assertNull(model.calculator.toQuaternary(-1)); // assumes we want to return null for negative numbers
    }

    // quatToDec() tests
    @Test
    void quatToDecRandomNumbers() {
        assertEquals(55, model.calculator.toDecimal(313));
        assertEquals(22, model.calculator.toDecimal(112));
        assertEquals(101, model.calculator.toDecimal(1211));
    }
    @Test
    void quatToDecEdgeCaseNumbers(){
        assertEquals(0, model.calculator.toDecimal(0));
        assertEquals(1, model.calculator.toDecimal(1));
        assertEquals(2, model.calculator.toDecimal(2));
        assertEquals(3, model.calculator.toDecimal(3));
        assertEquals(4, model.calculator.toDecimal(10));
    }

    // conversion sanity test
    @Test
    void quatDecSanity(){
        var originalInput = 10;
        var temp = model.calculator.toQuaternary(originalInput);
        var result = model.calculator.toDecimal(temp);
        assertEquals(originalInput, result);
    }
}