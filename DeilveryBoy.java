package spring;
public class DeilveryBoy {
    private boolean returns;
    private Orders order;
    public boolean isReturns() {
        return returns;
    }
    public void setReturns(boolean returns) {
        this.returns = returns;
    }
    public Orders getOrder() {
        return order;
    }
    public void setOrder(Orders order) {
        this.order = order;
    }
}