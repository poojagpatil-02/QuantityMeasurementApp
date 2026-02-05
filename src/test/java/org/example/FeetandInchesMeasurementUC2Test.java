package org.example;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class FeetandInchesMeasurementUC2Test {


        // 1. Feet Equality Same Value
        @Test
        public void testFeetEqualitySameValue() {
            double value1 = 5;
            double value2 = 5;

            boolean result = (value1 == value2);

            assertTrue(result);
        }

        // 2. Feet Equality Different Value
        @Test
        public void testFeetEqualityDifferentValue() {
            double value1 = 5;
            double value2 = 6;

            boolean result = (value1 == value2);

            assertFalse(result);
        }

        // 3. Inches Equality Same Value
        @Test
        public void testInchesEqualitySameValue() {
            double value1 = 10;
            double value2 = 10;

            boolean result = (value1 == value2);

            assertTrue(result);
        }

        // 4. Inches Equality Different Value
        @Test
        public void testInchesEqualityDifferentValue() {
            double value1 = 10;
            double value2 = 12;

            boolean result = (value1 == value2);

            assertFalse(result);
        }

        // 5. Null Check
        @Test
        public void testValueIsNull() {
            String value = null;

            assertNull(value);
        }

        // 6. Not Null Check
        @Test
        public void testValueIsNotNull() {
            String value = "Measurement";

            assertNotNull(value);
        }

        // 7. Feet Object Not Null
        @Test
        public void testFeetObjectNotNull() {
            Feet feet = new Feet();

            assertNotNull(feet);
        }

        // 8. Inches Object Not Null
        @Test
        public void testInchesObjectNotNull() {
            Inches inches = new Inches();

            assertNotNull(inches);
        }
}


