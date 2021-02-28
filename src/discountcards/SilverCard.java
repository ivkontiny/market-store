package discountcards;

public class SilverCard extends DiscountCard {

    public SilverCard(String owner, double turnover) {
        super(owner, turnover);

        if (turnover > 300.0) {
            this.setDiscountRate(3.5);
        } else {
            this.setDiscountRate(2.0);
        }
    }

}
