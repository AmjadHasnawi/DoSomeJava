public class Truck extends Vehicle {
    private  int load;

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    Truck(String model, int doors, int load){
        super(model,doors);
        setLoad(load);

    }
    public void  print(){
        super.print();
        System.out.println("Load"+load);
    }
}
