import java.util.Scanner;

public class Order {
    private  int checkout;
    Scanner sc = new Scanner(System.in);

    public int getCheckout() {
        return checkout;
    }

    public void setCheckout(int checkout) {
        this.checkout = checkout;
    }

    public void Send() {System.out.println("~~~~~~~ Send the order to restaurants ~~~~~~~"); }
    public void off(){
        System.out.println("Some thing wrong can't send order restaurants please try again;");}

    public void checkout(){
        System.out.print("Confirm order please enter 0 : ");
        this.checkout=sc.nextInt();
    }
}
