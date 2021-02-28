package discountcards;

public class BronzeCard extends DiscountCard {

    public BronzeCard(String owner, double turnover) {
        super(owner, turnover);

        if (100.0 <= turnover && turnover <= 300.0) {
            this.setDiscountRate(1.0);
        } else if (turnover > 300.0) {
            this.setDiscountRate(2.5);
        }
    }

}
