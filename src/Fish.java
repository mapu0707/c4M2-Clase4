public class Fish extends Animal{
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
    public void swim(){
        System.out.printf("%s esta swim ", getName());
    }
}
