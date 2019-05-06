public class Vehicle {
    private  String model;
    private  int numberOfDoors;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    Vehicle(String model, int doors){
        setModel(model);
        setNumberOfDoors(doors);
    }
    public void  print(){
        System.out.println("The Model"+model);
        System.out.println("The numDoors"+numberOfDoors);
    }
}
