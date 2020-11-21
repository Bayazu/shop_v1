import java.text.DecimalFormat;

public class Purchase {
    private Customer customer;
    private Products products;
    public static double finalPrice;

    private static double calcFinalPrice(Customer customer, Products products, Discount discount){
        double price = products.getPrice();
            price *= 1-discount.getValue();
        return price;
    }

    Purchase(Customer customer, Products products, Discount discount){
        this.customer = customer;
        this.products = products;
        this.finalPrice = calcFinalPrice(customer, products, discount);
    }

    @Override
    public String toString(){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return "Customer - " + customer.getName()+
                " buy " + products.getName()
                + " by price " + decimalFormat.format(finalPrice);
    }
}



