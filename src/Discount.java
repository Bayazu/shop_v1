public enum Discount {
    WITHOUT(0.0), DISCOUNT(0.3);
    private final double value;

    Discount(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

