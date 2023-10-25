package enums;

public enum ServicePlan {
    SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

    private int charges;

    private ServicePlan(int charges) {
        this.charges = charges;
    }

    public int getCharges() {
        return this.charges;
    }

    public String toString() {
        return name() + " with service charges " + charges;
    }
}