

public class ElectricityBill {
    String billerName;
    int lastReading;
    int currentReading;
    int totalUnit;
    int bill;


    ElectricityBill(String billerName,int currentReading,int lastReading){
        this.billerName=billerName;
        this.lastReading=lastReading;
        this.currentReading=currentReading;

        totalUnit=currentReading-lastReading;

        if (totalUnit>=200){
            this.bill=1800+((totalUnit-200)*5);
        } else if (totalUnit >= 100) {
            this.bill=1000+((totalUnit-100)*8);
        }else {
            this.bill=totalUnit*10;
        }
    }

    void display(){
        System.out.println("Biller Name : "+this.billerName);
        System.out.println("Total Units : "+ this.totalUnit);
        System.out.println("Bill Generated : "+this.bill);

    }

    public static void main(String[] args) {
        ElectricityBill e1 = new ElectricityBill("prateek",400,130);
        e1.display();

    }
}
