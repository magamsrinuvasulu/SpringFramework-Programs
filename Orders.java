package spring;
public class Orders {
    private int numberOfOrders;
    private float amount;
    private Product product;
    public int getNumberOfOrders() {
        return numberOfOrders;
    }
    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
}