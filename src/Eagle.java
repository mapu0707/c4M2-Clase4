public class Eagle extends Animal {
    private String type;

    public Eagle(String name, Integer age, String genre, String type) {
        super(name, age, genre);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
    public void fly(){
        System.out.printf("%s esta volando ", getName());
    }

    public void squeal(){
        System.out.printf("%s esta chillando ", getName());
    }
    public boolean canPutEggs(){
        return getGenre().equalsIgnoreCase("Hembra");
    }
}
