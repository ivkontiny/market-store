package discountcards;

/**
 * Class representing a bronze discount card.
 */
public class BronzeCard extends DiscountCard {

    /**
     * Constructor for a bronze discount card object.
     *
     * @param owner the name of the owner of the card
     * @param turnover the turnover for the previous month
     */
    public BronzeCard(String owner, double turnover) {
        super(owner, turnover);

        if (100.0 <= turnover && turnover <= 300.0) {
            this.setDiscountRate(1.0);
        } else if (turnover > 300.0) {
            this.setDiscountRate(2.5);
        }
    }

    /**
     * Setter for the turnover for the previous month.
     * NOTE: The turnover also reflects on the discount rate.
     *
     * @param turnover the turnover for the previous month
     */
    @Override
    public void setTurnover(double turnover) {
        super.setTurnover(turnover);

        if (100.0 <= turnover && turnover <= 300.0) {
            this.setDiscountRate(1.0);
        } else if (turnover > 300.0) {
            this.setDiscountRate(2.5);
        }
    }

}
