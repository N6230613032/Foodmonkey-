public class OrderNotSend implements Command{
    private Order oreder;
    public OrderNotSend(Order order){
        this.oreder = order;
    }

    @Override
    public  void execute(){
        oreder.off();
    }
}
