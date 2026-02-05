package org.example;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class FeetandInchesMeasurementUC3Test {

    // 1. 1 Feet == 12 Inch (True)
    @Test
    public void testOneFeetEqualToTwelveInch() {
        double value1 = 1;
        double value2 = 12;

        double valueInFeet1 = value1;        // feet
        double valueInFeet2 = value2 / 12;   // inch -> feet

        boolean result = (valueInFeet1 == valueInFeet2);

        assertTrue(result);
    }

    // 2. 2 Feet == 24 Inch (True)
    @Test
    public void testTwoFeetEqualToTwentyFourInch() {
        double value1 = 2;
        double value2 = 24;

        double valueInFeet1 = value1;
        double valueInFeet2 = value2 / 12;

        boolean result = (valueInFeet1 == valueInFeet2);

        assertTrue(result);
    }

    // 3. 1 Feet != 10 Inch (False)
    @Test
    public void testOneFeetNotEqualToTenInch() {
        double value1 = 1;
        double value2 = 10;

        double valueInFeet1 = value1;
        double valueInFeet2 = value2 / 12;

        boolean result = (valueInFeet1 == valueInFeet2);

        assertFalse(result);
    }

    // 4. 3 Feet != 12 Inch (False)
    @Test
    public void testThreeFeetNotEqualToTwelveInch() {
        double value1 = 3;
        double value2 = 12;

        double valueInFeet1 = value1;
        double valueInFeet2 = value2 / 12;

        boolean result = (valueInFeet1 == valueInFeet2);

        assertFalse(result);
    }

    // 5. Null Check
    @Test
    public void testValueIsNull() {
        String unit = null;

        assertNull(unit);
    }

    // 6. Not Null Check
    @Test
    public void testValueIsNotNull() {
        String unit = "feet";

        assertNotNull(unit);
    }

    // 7. Object Not Null Check (QuantityLength object)
    @Test
    public void testQuantityLengthObjectNotNull() {
        QuantityLength length = new QuantityLength();

        assertNotNull(length);
    }
}

