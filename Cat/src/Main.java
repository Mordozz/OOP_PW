public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 3);
        Cat cat2 = new Cat("Мурка", 5);
        Cat cat3 = new Cat("Дуська", 1);
        Owner owner1 = new Owner("Михаил");
        Owner owner2 = new Owner("Виталий");
        cat1.setOwner(owner1);
        cat2.setOwner(owner2);
        cat1.greet();
        cat2.greet();
        cat3.greet();
    }
}