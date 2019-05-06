public class Car extends Vehicle {

    private float price;
    private String color;
    private int id;
    private  int speed;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    Car(String model, int price,String color,String id,int doors){
        super(model,doors);

    }

    public void  move(){
        this.speed += 40;
    }
}
