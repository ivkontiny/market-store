package discountcards;

/**
 * Class representing a silver discount card.
 */
public class SilverCard extends DiscountCard {

    /**
     * Constructor for the silver discount card object.
     *
     * @param owner the name of the owner of the card
     * @param turnover the turnover for the previous month
     */
    public SilverCard(String owner, double turnover) {
        super(owner, turnover);

        if (turnover > 300.0) {
            this.setDiscountRate(3.5);
        } else {
            this.setDiscountRate(2.0);
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

        if (turnover > 300.0) {
            this.setDiscountRate(3.5);
        } else {
            this.setDiscountRate(2.0);
        }
    }

}
