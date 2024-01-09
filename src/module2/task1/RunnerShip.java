package module2.task1;

public class RunnerShip {
    public static void main(String[] args){
        Ship Hermes = new Ship("HERMES", "8:30", 120, false);
        Ship tito = new Ship("TITO", "5:00", 30, false);
        Ship shanyrak = new Ship("SHANYRAK", "10:10", 25, true);
        Ship bolona = new Ship("BOLONA", "18:15", 130, true);
        Ship kelvin = new Ship("KELVIN", "2:05", 480, false);
        Ship tatooan = new Ship("TATOOAN", "5:00", 180, false);
        Ship kikogawa = new Ship("KIKOGAWA", "6:45", 1020, true);
        Ship ramses = new Ship("RAMSES", "9:45", 30, false);
        Ship divora = new Ship("DIVORA", "11:00", 60, false);
        Ship helena = new Ship("HELENA", "7:30", 300, true);
        Hermes.allowedShips(Hermes.name, Hermes.arrival_time, Hermes.stay_time, Hermes.is_distress);
        tito.allowedShips(tito.name, tito.arrival_time, tito.stay_time, tito.is_distress);
        shanyrak.allowedShips(shanyrak.name, shanyrak.arrival_time, shanyrak.stay_time, shanyrak.is_distress);
        bolona.allowedShips(bolona.name, bolona.arrival_time, bolona.stay_time, bolona.is_distress);
        kelvin.allowedShips(kelvin.name, kelvin.arrival_time, kelvin.stay_time, kelvin.is_distress);
        tatooan.allowedShips(tatooan.name, tatooan.arrival_time, tatooan.stay_time, tatooan.is_distress);
        kikogawa.allowedShips(kikogawa.name, kikogawa.arrival_time, kikogawa.stay_time, kikogawa.is_distress);
        ramses.allowedShips(ramses.name, ramses.arrival_time, ramses.stay_time, ramses.is_distress);
        divora.allowedShips(divora.name, divora.arrival_time, divora.stay_time, divora.is_distress);
        helena.allowedShips(helena.name, helena.arrival_time, helena.stay_time, helena.is_distress);

    }
}