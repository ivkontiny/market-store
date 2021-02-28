import discountcards.BronzeCard;
import discountcards.DiscountCard;
import discountcards.GoldCard;
import discountcards.SilverCard;
import purchase.PurchaseWithDiscountCard;

public class Main {

    public static void main(String[] args) {
        DiscountCard bronzeCard = new BronzeCard("Owner A", 0);
        DiscountCard silverCard = new SilverCard("Owner B", 600);
        DiscountCard goldCard = new GoldCard("Owner C", 1500);

        PurchaseWithDiscountCard purchaseOwnerA = new PurchaseWithDiscountCard(bronzeCard, 150);
        PurchaseWithDiscountCard purchaseOwnerB = new PurchaseWithDiscountCard(silverCard, 850);
        PurchaseWithDiscountCard purchaseOwnerC = new PurchaseWithDiscountCard(goldCard, 1300);

        System.out.println(purchaseOwnerA);
        System.out.println(purchaseOwnerB);
        System.out.println(purchaseOwnerC);
    }

}
