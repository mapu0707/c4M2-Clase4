public class Lion extends Animal{
    private String color;

    public Lion(String name, Integer age, String genre, String color) {
        super(name, age, genre);
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void roar(){
        System.out.printf("%s esta rugiendo ", getName());
    }    
    public void run(){
        System.out.printf("%s esta corriendo ", getName());
    }
}
