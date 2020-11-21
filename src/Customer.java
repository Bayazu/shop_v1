public class Customer {
    private String name;
    private double money;
    private boolean regular = false;
    public int score = 0;

    public Customer(String name, double money){
        this.name=name;
        this.money=money;
    }
//customer.setMoney(customer.getMoney()-finalPrice);
    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money){
        this.money = getMoney()-Purchase.finalPrice;
    }

    public static int generateRandomMoney(){
        double a = 1;
        double b = 250;
        double result = (a+(double)(Math.random()*b));
        return (int) result;
    }
    public void setRegular(boolean regular){this.regular=regular;}

    @Override
    public String toString() {return name + " " + money;}
}
