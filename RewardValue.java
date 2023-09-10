public record RewardValue(double cashValue) {
    // Constructor that accepts a cash value

    // Getter for miles value (calculated based on the cash value)
    public double getMilesValue() {
        return cashValue / 0.0035;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (RewardValue) obj;
        return Double.doubleToLongBits(this.cashValue) == Double.doubleToLongBits(that.cashValue);
    }

    @Override
    public String toString() {
        return "RewardValue[" +
                "cashValue=" + cashValue + ']';
    }

}
