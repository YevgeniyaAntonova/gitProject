public class Abstracts {

    public static class Pet extends Animal {
        String environment;
        public Pet(){
        }
        public Pet(String name,String environment){
            super(name);
            this.environment = environment;

        }
        public String getEnvironment(){
            return  environment;
        }
        public void setEnvironment(String environment){
            this.environment = environment;
        }
        public  String toString(){
            return  super.toString() + " " + environment;
        }
    }
}
