package discountcards;

public class GoldCard extends DiscountCard {

    public GoldCard(String owner, double turnover) {
        super(owner, turnover);

        int discountRateGrowth = (int) (turnover / 100.0);
        this.setDiscountRate(Math.min(10.0, 2.0 + discountRateGrowth));
    }

}
