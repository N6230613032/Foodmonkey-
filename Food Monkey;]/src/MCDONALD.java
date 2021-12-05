public class MCDONALD {
    private String[] menuMcdonald = {"Double Samurai Set", "Big Mac (Beef)", "Triple Beef Cheeseburger (Beef)", "Filet Cheese Stick Set", "Korean Chicken"};
    private int[] PriceMcdonald = {199,89,399,279,89};

    public void setMenuMcdonald(String[] menuMcdonald) {
        this.menuMcdonald = menuMcdonald;
    }

    public String[] getMenuMcdonald() {
        return menuMcdonald;
    }

    public void setPriceMcdonald(int[] priceMcdonald) {
        PriceMcdonald = priceMcdonald;
    }


    public int[] getPriceMcdonald() {
        return PriceMcdonald;
    }

    public void menu(){
        for(int i = 0; i < menuMcdonald.length; i++){
            System.out.print(i + " ");
            System.out.print(menuMcdonald[i] + " ");
            System.out.println(PriceMcdonald[i] + " Baht");
        }
    }
    public String SepMenuMcdonald(int index){
        return menuMcdonald[index];
    }
    public int PriceMcdonald(int index){
        return PriceMcdonald[index];
    }

    }

