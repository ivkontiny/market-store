package discountcards;

/**
 * Class representing a gold discount card.
 */
public class GoldCard extends DiscountCard {

    /**
     * Constructor for the gold discount card object.
     *
     * @param owner the name of the owner of the card
     * @param turnover the turnover for the previous month
     */
    public GoldCard(String owner, double turnover) {
        super(owner, turnover);

        int discountRateGrowth = (int) (turnover / 100.0);
        this.setDiscountRate(Math.min(10.0, 2.0 + discountRateGrowth));
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

        int discountRateGrowth = (int) (turnover / 100.0);
        this.setDiscountRate(Math.min(10.0, 2.0 + discountRateGrowth));
    }

}
