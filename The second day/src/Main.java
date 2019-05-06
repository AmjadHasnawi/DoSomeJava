public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person people = new Person();
        Person yazeed = new Person();
        Person mahmoud = new Person();
        Person joza = new Person();
        Person ashraf = new Person();
        Person[] personArray = {yazeed, mahmoud, joza, ashraf};

        System.out.println(Person.counter);
        System.out.println(yazeed.counter);

    }
}
