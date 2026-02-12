package org.example;

//import junit.framework.Test;
import static org.junit.Assert.*;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.example.MeasurementUC4.LengthUnit;



public class MeasurementUC4Test {
    @Test
    public void YardAnd3FeetShouldReturnTrue() {
        MeasurementUC4 q1 = new MeasurementUC4(1.0, LengthUnit.YARDS);
        MeasurementUC4 q2 = new MeasurementUC4(3.0, LengthUnit.FEET);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void YardAnd36InchShouldReturnTrue() {
        MeasurementUC4 q1 = new MeasurementUC4(1.0, LengthUnit.YARDS);
        MeasurementUC4 q2 = new MeasurementUC4(36.0, LengthUnit.INCH);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void CmAnd0_393701InchShouldReturnTrue() {
        MeasurementUC4 q1 = new MeasurementUC4(1.0, LengthUnit.CENTIMETERS);
        MeasurementUC4 q2 = new MeasurementUC4(0.393701, LengthUnit.INCH);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void Yard2And2YardShouldReturnTrue() {
        MeasurementUC4 q1 = new MeasurementUC4(2.0, LengthUnit.YARDS);
        MeasurementUC4 q2 = new MeasurementUC4(2.0, LengthUnit.YARDS);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void Yard1And2FeetShouldReturnFalse() {
        MeasurementUC4 q1 = new MeasurementUC4(1.0, LengthUnit.YARDS);
        MeasurementUC4 q2 = new MeasurementUC4(2.0, LengthUnit.FEET);
        assertFalse(q1.equals(q2));
    }
}
