public class KFC {
    private String[] menuKfc = {"Fried Chickens", "Chicken Pop", "Nugget", "French Fries","Egg tart"};
    private int[] PriceKfc = {599,49,19,59,99};
    public void setMenuKfc(String[] menuKfc) {
        this.menuKfc = menuKfc;
    }

    public String[] getMenuKfc() {
        return menuKfc;
    }

    public void setPriceKfc(int[] priceKfc) {
        PriceKfc = priceKfc;
    }

    public int[] getPriceKfc() {
        return PriceKfc;
    }

    public void menu(){
        for(int i = 0; i < menuKfc.length; i++){
            System.out.print(i + " ");
            System.out.print(this.SpeMenuKFC(i) + " ");
            System.out.println(PriceKfc[i] + " Baht");
        }
    }
    public String SpeMenuKFC(int index){
        return menuKfc[index];
    }
    public int PriceKfc(int index){
        return PriceKfc[index];
    }
}
