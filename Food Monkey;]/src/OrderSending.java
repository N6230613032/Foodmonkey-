public class OrderSending implements Command {
    private Order order;

    public OrderSending(Order order){
        this.order = order;
    }

    @Override
    public void execute() {
        order.Send();
    }
}
