import java.util.ArrayList;

public class main {
    public static void main (String[] args){
        Restaurants restaurants = new Restaurants();
        PROMOTION promotion = new PROMOTION();
        ManageOrder manageOrder = new ManageOrder();
        Order order = new Order();
        OrderSending sendOrder = new OrderSending(order);
        OrderNotSend wrongOrder = new OrderNotSend(order);


        System.out.println("--- Monkey Food ---");
        restaurants.nameAllRestaurants();
        System.out.println("----------------------");
        restaurants.selectReataurant();
        System.out.println("----------------------");
        System.out.println("MENU");
        restaurants.menu();
        restaurants.SelectMenu();
        System.out.println("----------------------");
        System.out.println("Your order");
        System.out.println();
        restaurants.showMenu();
        System.out.println();
        System.out.print("Total : ");
        restaurants.calculatemenu();
        System.out.println("----------------------");
        promotion.setTotalprice(restaurants.getallprice());
        System.out.println();
        promotion.Promotion();
        promotion.discount();
        System.out.println("----------------------");
        System.out.println();
        System.out.println("Your order");
        restaurants.showMenu();
        System.out.println();
        System.out.println("Deliver fee: 10 baht");
        System.out.print("Total : ");
        System.out.println(promotion.getTotaldiscount()-10);
        System.out.println("Thank You:)");
        System.out.println();
        order.checkout();
        System.out.println("----------------------");
        manageOrder.setSend(sendOrder);
        manageOrder.ordersending();







    }
}
