package purchase;

import discountcards.DiscountCard;

import java.util.Locale;

/**
 * Class representing a purchase with a discount card.
 */
public class PurchaseWithDiscountCard {

    /**
     * The discount card with which the purchase was done.
     */
    private DiscountCard discountCard;

    /**
     * The value of the purchase.
     */
    private double purchaseValue;

    /**
     * Constructor for the purchase object.
     *
     * @param discountCard the discount card with which the purchase was done
     * @param purchaseValue the value of the purchase
     */
    public PurchaseWithDiscountCard(DiscountCard discountCard, double purchaseValue) {
        this.discountCard = discountCard;
        this.purchaseValue = purchaseValue;
    }

    /**
     * Getter for the discount card.
     *
     * @return the discount card with which the purchase was done
     */
    public DiscountCard getDiscountCard() {
        return discountCard;
    }

    /**
     * Setter for the discount card.
     *
     * @param discountCard the discount card with which the purchase was done
     */
    public void setDiscountCard(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }

    /**
     * Getter for the value of the purchase.
     *
     * @return the value of the purchase
     */
    public double getPurchaseValue() {
        return purchaseValue;
    }

    /**
     * Setter for the value of the purchase.
     *
     * @param purchaseValue the value of the purchase
     */
    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    /**
     * Calculates the discount for the purchase.
     *
     * @return the discount for the purchase
     */
    private double getDiscount() {
        return (discountCard.getDiscountRate() / 100.0) * purchaseValue;
    }

    /**
     * String representation of the purchase object. Used to print the object to the console.
     *
     * @return string representation of the purchase object
     */
    @Override
    public String toString() {
        double discount = getDiscount();

        return "Purchase value: $" + String.format(Locale.US, "%.2f", purchaseValue) + "\n" +
                "Discount rate: " + String.format(Locale.US, "%.1f", discountCard.getDiscountRate()) + "%\n" +
                "Discount: $" + String.format(Locale.US, "%.2f", discount) + "\n" +
                "Total: $" + String.format(Locale.US, "%.2f", purchaseValue - discount) + "\n";
    }

}
