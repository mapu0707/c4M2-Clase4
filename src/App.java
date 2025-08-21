public class App {
    public static void main(String[] args) throws Exception {
        var eagle = new Eagle("Aguila Maria", 2, "Hembra", "Arpia");
        var lion = new Lion("Andres", 5, "Macho", "Amarillo");
        var fish = new Fish("Nemo", 1, "Macho", "Naranja", true);

        eagle.fly();
        eagle.hunt();
        eagle.happyBirthday();
        System.out.println("El " + eagle.getName() + "tiene" + eagle.getAge() + "años ");
        System.out.println("El " + eagle.getName() + " " + (eagle.canPutEggs() ? "si" : "no") + "puede poner huevos ");

        lion.roar();
        lion.hunt();
        eagle.happyBirthday();
        System.out.println("El " + lion.getName() + "tiene" + lion.getAge() + "años");

        fish.swim();
        fish.hunt();
        fish.happyBirthday();
        System.out.println("El " + fish.getName() + "tiene" + fish.getAge() + "años ");
        System.out.println("El " + fish.getName() + " " + (fish.canPutEggs() ? "si" : "no") + "puede poner huevos ");
        System.out.println("El " + fish.getName() + " " + (fish.isFromSea() ? "es de mar" : "es de rio") + "puede poner huevos ");

    }
}
