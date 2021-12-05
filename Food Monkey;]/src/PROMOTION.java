import java.util.Scanner;
public class PROMOTION {
    private String[] code_id = {"101", "102", "999"};
    private String[] Promotion = {"discount 15%","discount 5 baht","discount 50%"};
    private int code = -1;
    private float totaldiscount;
    private float totalprice;
    public  int check = -1;
    Scanner sc = new Scanner(System.in);

    Restaurants restaurants = new Restaurants();

    public void setCode_id(String[] code_id) {
        this.code_id = code_id;
    }

    public String[] getCode_id() {
        return code_id;
    }

    public void setTotaldiscount(float totaldiscount) {
        this.totaldiscount = totaldiscount;
    }

    public float getTotaldiscount() {
        return totaldiscount;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void Promotion() {
        System.out.print("Do you have code promotion Yes= 1/No= 0 : ");
        this.check = sc.nextInt();
        if (this.check == 1) {
            for (int i = 0; i < code_id.length; i++) {
                System.out.print("-");
                System.out.print(code_id[i] +" ");
                System.out.println(this.Promotion[i]);
            }
        } else if(check == 0) {
            System.out.println("Next to Order;)");
        }
    }
    public void discount() {
        System.out.print("Code promotion : ");
        this.code = sc.nextInt();
        if (this.code == 101) {
            totaldiscount = (getTotalprice() * 85)/100;
            System.out.println(totaldiscount);
            System.out.println("Nice! get code discount already:)");

        }else if(this.code == 102){
            totaldiscount = getTotalprice() - 5;
            System.out.println(totaldiscount);
            System.out.println("Nice! get code discount already:)");

        }else{
            totaldiscount = (totalprice * 50)/100;
            System.out.println(totalprice);
            System.out.println("Nice! get code discount already:)");
        }
    }
}


