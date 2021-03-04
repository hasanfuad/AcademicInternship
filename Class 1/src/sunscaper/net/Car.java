package sunscaper.net;

public class Car {
    private String name;
    private int price;

    public Car(String cName, int cPrice) {
        name = cName;
        price = cPrice;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }


}
