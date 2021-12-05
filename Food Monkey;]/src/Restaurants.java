import java.util.Scanner;
public class Restaurants {

    private String[] nameAllRestaurants = {"KFC","Mcdonald"};
    private String nemeRestaurant;
    private int restaurant;
    private int item[]={-1,-1,-1,-1,-1,-1,-1,-1,-1};
    private int count = 0;
    int checkOut = 1;
    private float allprice;
    Scanner sc = new Scanner(System.in);

    KFC kfc = new KFC();
    MCDONALD macdonal = new MCDONALD();



    public void setNameAllRestaurants(String[] nameAllRestaurants) {
        this.nameAllRestaurants = nameAllRestaurants;
    }

    public String[] getNameAllRestaurants() {
        return nameAllRestaurants;
    }

    public void setNemeRestaurant(String nemeRestaurant) {
        this.nemeRestaurant = nemeRestaurant;
    }

    public String getNemeRestaurant() {
        return nemeRestaurant;
    }

    public void setallprice(float allprice) {
        this.allprice = allprice;
    }

    public float getallprice() {
        return allprice;
    }

    public void nameAllRestaurants(){
        for(int i = 0; i < nameAllRestaurants.length; i++){
            System.out.print(i +" ");
            System.out.println(this.nameAllRestaurants[i]+ "\uD83C\uDF57");
        }
    }
    public void selectReataurant(){
        System.out.print("Select one restaurant : ");
        this.restaurant=sc.nextInt();
    }
    public void menu(){
        if (this.restaurant == 0){
            this.kfc.menu();

        }else if(this.restaurant == 1){
            this.macdonal.menu();
        }
    }
    public void SelectMenu(){

        while (this.checkOut != 99){
            System.out.println();
            System.out.print("Select menu : ");
            for(int i=0;i<this.item.length;i++)
                if(this.item[i]==-1) {
                    this.item[i]=sc.nextInt();
                    break;
                }
            this.count++;
            System.out.print("more menu or not if not typing 99 : ");
            this.checkOut=sc.nextInt();
        }

    }
    public void showMenu(){
        if(this.restaurant ==0){
        for(int i =0;i<item.length;i++) {
            if(this.item[i]!=-1) {
                System.out.print("-");
                System.out.print(this.kfc.SpeMenuKFC(this.item[i])+" ");
                System.out.println(this.kfc.PriceKfc(this.item[i]));
            }
        }
        }else if(this.restaurant ==1){
            for(int i =0;i<item.length;i++) {
                if(this.item[i]!=-1) {
                    System.out.print("-");
                    System.out.print(this.macdonal.SepMenuMcdonald(this.item[i])+" ");
                    System.out.println(this.macdonal.PriceMcdonald(this.item[i]));
                }
            }
        }
    }
    public void calculatemenu(){
        if(this.restaurant ==0) {
            for (int i = 0; i < item.length; i++) {
                if (this.item[i] != -1) {
                    allprice += this.kfc.PriceKfc(this.item[i]);
                }
            }
        }else if(this.restaurant ==1){
            for (int i = 0; i < item.length; i++) {
                if (this.item[i] != -1) {
                    allprice += this.macdonal.PriceMcdonald(this.item[i]);
                }
            }
        }

        System.out.println(this.allprice + " Baht");


    }


}
