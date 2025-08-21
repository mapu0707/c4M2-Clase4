public class Fish extends Animal implements CanSwim{
    private String color;
    private boolean fromSea;

    public Fish(String name, Integer age, String genre, String color, boolean isFromSea) {
        super(name, age, genre);
        this.color = color;
        this.fromSea = isFromSea;
    }
    public String getColor() {
        return color;
    }
    public Boolean isFromSea(){
        return fromSea;
    }
    public boolean canPutEggs(){
        return getGenre().equalsIgnoreCase("Hembra");
    }
    @Override
    public void swim(){
        System.out.printf("%s esta swim ", getName());
    }
    @Override
    public void hunt() {
        System.out.printf("%s esta nadando, se cruza con el objetivo, abre la boca y se lo come%n", getName());
    }

    @Override
    public void makeNoise() {
        System.out.printf("%s dice GLOB GLOB%n", getName());
        
    }
}
