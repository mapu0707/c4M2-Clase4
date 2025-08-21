public class App {
    public static void main(String[] args) throws Exception {
        var eagle = new Eagle("Aguila Maria", 2, "Hembra", "Arpia");
        var lion = new Lion("Andres", 5, "Macho", "Amarillo");
        var fish = new Fish("Nemo", 1, "Macho", "Naranja", true);
        var duck = new Duck("Manuel", 7, "Macho", "negro");

        eagle.fly();
        eagle.hunt();
        eagle.happyBirthday();
        System.out.println("El " + eagle.getName() + " tiene " + eagle.getAge() + " años ");
        System.out.println("El " + eagle.getName() + " " + (eagle.canPutEggs() ? "si" : "no") + "puede poner huevos ");

        lion.roar();
        lion.hunt();
        eagle.happyBirthday();
        System.out.println("El " + lion.getName() + " tiene " + lion.getAge() + " años ");

        fish.swim();
        fish.hunt();
        fish.happyBirthday();
        System.out.println("El " + fish.getName() + " tiene " + fish.getAge() + "años ");
        System.out.println("El " + fish.getName() + " " + (fish.canPutEggs() ? "si" : "no") + " puede poner huevos ");
        System.out.println("El " + fish.getName() + " " + (fish.isFromSea() ? "es de mar" : "es de rio"));

        duck.swim();
        duck.fly();
        duck.hunt();
        duck.run();
        duck.happyBirthday();
        System.out.println("El " + duck.getName() + " tiene " + duck.getAge() + "años ");
        System.out.println("El " + duck.getName() + " " + (duck.canPutEggs() ? "si" : "no") + " puede poner huevos ");

        CanSwim animal1 = new Fish("Santiago", 15, "Macho", "Amarillo", true);
        animal1.swim();
        CanSwim animal2 = new Duck("Carolina", 6, "Hembra", "Cafe");
        animal2.swim();
        CanFly animal3 = (CanFly) animal2; //Casting
        animal3.fly();
        Animal animal4 = (Animal) animal3;
        animal4.happyBirthday();
        animal4.makeNoise();
    }
}
