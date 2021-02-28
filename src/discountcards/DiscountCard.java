package discountcards;

public abstract class DiscountCard {

    private String owner;
    private double turnover;
    private double discountRate;

    public DiscountCard(String owner, double turnover) {
        this.owner = owner;
        this.turnover = turnover;
        this.discountRate = 0.0;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscount(double purchaseValue) {
        return purchaseValue * discountRate / 100.0;
    }

}
