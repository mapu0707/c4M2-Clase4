public class Duck extends Animal implements CanFly, CanRun, CanSwim{
    private String color;

    public Duck(String name, Integer age, String genre, String color) {
        super(name, age, genre);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void hunt() {
        System.out.printf("%s va nadando, se posa sobre el pez y mete la cabeza para tomarlo%n", getName());
    }

    @Override
    public void makeNoise() {
        System.out.printf("%s hace CUACK CUACK%n", getName());
    }

    @Override
    public void fly(){
        System.out.printf("%s esta volando ", getName());
    }
    @Override
    public void swim(){
        System.out.printf("%s esta nadando ", getName());
    }
    @Override
    public void run(){
        System.out.printf("%s esta corriendo ", getName());
    }

    public boolean canPutEggs(){
        return getGenre().equalsIgnoreCase("Hembra");
    }
    
}
