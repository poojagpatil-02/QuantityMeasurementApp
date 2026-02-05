package org.example;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class FeetMeasurementUC1Test
    extends TestCase
{
    // 1. testEquality SameValue
    @Test
    public void testEquality_SameValue() {
        double value1 = 10;
        double value2 = 10;

        boolean result = (value1 == value2);

        assertTrue(result);
    }

    // 2. testEquality DifferentValue
    @Test
    public void testEquality_DifferentValue() {
        double value1 = 10;
        double value2 = 20;

        boolean result = (value1 == value2);

        assertFalse(result);
    }

    // 3. testEquality Null Comparison
    @Test
    public void testEquality_NullComparison() {
        Double value1 = null;
        Double value2 = 10.0;

        // If value1 is null, comparison should not happen
        assertThrows(NullPointerException.class, () -> {
            boolean result = (value1.equals(value2));
        });
    }

    // 4. testEquality NonNumericInput
    @Test
    public void testEquality_NonNumericInput() {
        String input1 = "abc";
        String input2 = "10";

        assertThrows(NumberFormatException.class, () -> {
            double value1 = Double.parseDouble(input1);
            double value2 = Double.parseDouble(input2);
        });
    }
}