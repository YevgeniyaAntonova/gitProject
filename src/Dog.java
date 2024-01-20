public class Dog extends Abstracts.Pet {
    String breed;
    public Dog(){
    }
    public Dog(String name, String enviroment, String breed){
        super(name, enviroment);
        this.breed = breed;
    }
    public String getDog(){
        return breed;
    }
    public void setDog(String breed){
        this.breed = breed;
    }
    public String toString(){
       return super.toString() + " " +breed;
    }
}
