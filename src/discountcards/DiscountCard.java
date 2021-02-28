package discountcards;

/**
 * Class representing a discount card.
 */
public abstract class DiscountCard {

    /**
     * The owner of the discount card.
     */
    private String owner;

    /**
     * The turnover for the previous month.
     */
    private double turnover;

    /**
     * The discount rate corresponding to the discount card.
     */
    private double discountRate;

    /**
     * Constructor for the discount card object.
     *
     * @param owner the name of the discount card's owner
     * @param turnover the turnover from the previous month
     */
    public DiscountCard(String owner, double turnover) {
        this.owner = owner;
        this.turnover = turnover;
        this.discountRate = 0.0;
    }

    /**
     * Getter for the owner of the card.
     *
     * @return the name of the owner of the discount card
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Setter for the owner of the card.
     *
     * @param owner the name of the owner of the discount card
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Getter for the turnover for the previous month.
     *
     * @return the turnover for the previous month
     */
    public double getTurnover() {
        return turnover;
    }

    /**
     * Setter for the turnover for the previous month.
     *
     * @param turnover the turnover for the previous month
     */
    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    /**
     * Getter for the discount rate.
     *
     * @return the discount rate of the card
     */
    public double getDiscountRate() {
        return discountRate;
    }

    /**
     * Setter for the discount rate.
     *
     * @param discountRate the discount rate of the card
     */
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

}
