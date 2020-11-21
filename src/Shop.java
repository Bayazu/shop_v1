import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Products> products = new ArrayList<>();
    private List<Purchase> purchases = new ArrayList<>();
    private Discount wdiscount = Discount.WITHOUT;
    private Discount discount = Discount.DISCOUNT;

    public static int generateRandomPrice(){
        int a = 1;
        int b = 100;
        int random_number1 = a+(int) (Math.random()*b);
        return random_number1;
    }

    public Shop(){
        products.add(new Products("TV",generateRandomPrice()));
        products.add(new Products("Milk",generateRandomPrice()));
        products.add(new Products("Bread",generateRandomPrice()));
    }

    public List<Products> getProducts(){
        return products;
    }
    public List<Purchase> getPurchases(){
        return purchases;
    }


    public void setDiscount(Discount discount){
        this.discount=discount;
    }

    public Purchase createPurchase(Customer customer, Products products){
        if (customer.score == 3)
            customer.setRegular(true);
        Purchase purchase = new Purchase(customer,products,discount);
        purchases.add(purchase);
        customer.score +=1;
        return purchase;
    }


    public void endPurchases(){
        System.out.println("\nPurchases: ");
        for (Purchase purchase : getPurchases()){
            System.out.println(purchase);
        }
    }

}


