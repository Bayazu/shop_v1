import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        for (Products products: shop.getProducts()){
            System.out.println(products);
        }
        Customer alex = new Customer("alex",Customer.generateRandomMoney());
        System.out.println(alex);

        shop.setDiscount(Discount.DISCOUNT);
        buy(alex,shop.getProducts().get(0),shop);
        buy(alex,shop.getProducts().get(0),shop);
        buy(alex,shop.getProducts().get(0),shop);
        buy(alex,shop.getProducts().get(0),shop);
        check(alex);
        shop.endPurchases();

    }
    private static void buy(Customer customer,Products products, Shop shop){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println(shop.createPurchase(customer, products)+ " Remainder : " + decimalFormat.format(customer.getMoney()));

    }
    private static void check(Customer customer){
        if (customer.getMoney()<0)
            System.out.println("Customer has debt : "+customer.getMoney());
    }

}
