package org.example;

class MeasurementUC4 {

    private final LengthUnit lengthunit;
    private final double v;

    public MeasurementUC4(double v, LengthUnit lengthUnit) {
        this.v =v;
        this.lengthunit=lengthUnit;
    }

    /* -------------------- ENUM -------------------- */
     enum LengthUnit {
        INCH(1.0),
        FEET(12.0),          // 1 feet = 12 inches
        YARDS(36.0),         // 1 yard = 36 inches
        CENTIMETERS(0.393701); // 1 cm = 0.393701 inches
        private final double toInches;
        LengthUnit(double toInches) {
            this.toInches = toInches;
        }
        public double toInches(double value) {
            return value * toInches;
        }
    }
    /* -------------------- QUANTITY CLASS -------------------- */
    static class QuantityLength {
        private final double value;
        private final LengthUnit unit;
        public QuantityLength(double value, LengthUnit unit) {
            this.value = value;
            this.unit = unit;
        }
        private double convertToInches() {
            return unit.toInches(value);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            QuantityLength other = (QuantityLength) obj;
            if (this.unit == null || other.unit == null) return false;
            return Double.compare(
                    this.convertToInches(),
                    other.convertToInches()
            ) == 0;
        }
    }
    /* -------------------- MAIN METHOD -------------------- */
    public static void main(String[] args) {
        System.out.println(
                new QuantityLength(1.0, LengthUnit.YARDS)
                        .equals(new QuantityLength(3.0, LengthUnit.FEET))
        );
        System.out.println(
                new QuantityLength(1.0, LengthUnit.YARDS)
                        .equals(new QuantityLength(36.0, LengthUnit.INCH))
        );
        System.out.println(
                new QuantityLength(2.0, LengthUnit.YARDS)
                        .equals(new QuantityLength(2.0, LengthUnit.YARDS))
        );
        System.out.println(
                new QuantityLength(2.0, LengthUnit.CENTIMETERS)
                        .equals(new QuantityLength(2.0, LengthUnit.CENTIMETERS))
        );
        System.out.println(
                new QuantityLength(1.0, LengthUnit.CENTIMETERS)
                        .equals(new QuantityLength(0.393701, LengthUnit.INCH))
        );
    }
}


