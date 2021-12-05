public class ManageOrder {
    Command send;

    public void setSend(Command command) {
        send = command;
    }

    public void ordersending(){
        send.execute();
    }
}
