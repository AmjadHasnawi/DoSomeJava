public class Person {
    private int count;
    private String firstName;
    private String lastName;
    private String address;
    private int dateOfBirth;
    private String nationality;
    private String city;
    private int weight;
    private int height;
    private Boolean isMale;
    static int counter = 0;

    public void setCount(int count){
        this.count = count;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setDateOfBirth(int dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setIsMale(Boolean isMale){
        this.isMale = isMale;
    }

    // getter methods

    public int getCount(){
        return this.count ;
    }
    public String getFirstName(){
        return  this.firstName;
    }
    public String getLastName(){
        return this.lastName ;
    }
    public String getAddress(){
        return  this.address;
    }
    public int getDateOfBirth(){
        return  this.dateOfBirth;
    }
    public String getNationality(){
        return this.nationality;
    }
    public String getCity(){
        return this.city;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getHeight(){
        return this.height;
    }
    public Boolean getIsMale(){
        return this.isMale;
    }

    public Person() {
        count = 0;
        firstName = "Yazeed";
        lastName = "Hammad";
        address = "Jordan";
        dateOfBirth = 1980;
        nationality = "Jordanian";
        city = "Amman";
        weight = 82;
        height = 182;
        isMale = true;
        this.counter++;
    }

    public Person(int count, String firstName, String lastName, String adress, int dateOfBirth,
                  String nationality, String city, int weight, int height, Boolean isMale) {
        this.setCount(count);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAddress(adress);
        this.setDateOfBirth(dateOfBirth);
        this.setNationality(nationality);
        this.setCity(city);
        this.setWeight(weight);
        this.setHeight(height);
        this.setIsMale(isMale);
        this.counter++;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getHeightInFeet() {
        double feet = height/30.48;
        return feet;
    }

    public int getAge() {
        int age = 2019 - dateOfBirth;
        return age;
    }

    public void eating() {
        System.out.println("Im eatig!");
        weight++;
    }

    public void getInfo() {
        System.out.println(count + firstName + lastName + address + dateOfBirth + nationality +
                city + weight + height + isMale );
    }
}
