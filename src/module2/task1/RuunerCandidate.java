package module2.task1;

public class RuunerCandidate {
    public static void main(String[] args) {
        Candidate James = new Candidate("James Clark", "banker", 5000);
        Candidate Edvin = new Candidate("Edvin Johnson", "architect", 3000);
        Candidate Katty = new Candidate("Katty Wesley", "designer", 5500);
        Candidate Bread = new Candidate("Bread Pitt", "cooker", 3000);
        Candidate Jane = new Candidate("Jane Edisson", "scientist", 2500);
        Candidate William = new Candidate("William Johnson", "banker", 1100);
        Candidate Askar = new Candidate("Askar Balgabek", "dianolicisonist", 10);
        Candidate Liam = new Candidate("Liam Turvey", "designer", 6500);
        James.candidates(James.name, James.work, James.income);
        Edvin.candidates(Edvin.name, Edvin.work, Edvin.income);
        Katty.candidates(Katty.name, Katty.work, Katty.income);
        Bread.candidates(Bread.name, Bread.work, Bread.income);
        Jane.candidates(Jane.name, Jane.work, Jane.income);
        William.candidates(William.name, William.work, William.income);
        Askar.candidates(Askar.name, Askar.work, Askar.income);
        Liam.candidates(Liam.name, Liam.work, Liam.income);
    }
}