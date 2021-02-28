package purchase;

import discountcards.DiscountCard;

import java.util.Locale;

public class PurchaseWithDiscountCard {

    private DiscountCard discountCard;
    private double purchaseValue;

    public PurchaseWithDiscountCard(DiscountCard discountCard, double purchaseValue) {
        this.discountCard = discountCard;
        this.purchaseValue = purchaseValue;
    }

    public DiscountCard getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    private double getDiscount() {
        return (discountCard.getDiscountRate() / 100.0) * purchaseValue;
    }

    public String toString() {
        double discount = getDiscount();

        return "Purchase value: $" + String.format(Locale.US, "%.2f", purchaseValue) + "\n" +
                "Discount rate: " + String.format(Locale.US, "%.1f", discountCard.getDiscountRate()) + "%\n" +
                "Discount: $" + String.format(Locale.US, "%.2f", discount) + "\n" +
                "Total: $" + String.format(Locale.US, "%.2f", purchaseValue - discount) + "\n";
    }

}
