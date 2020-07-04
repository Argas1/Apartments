import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apartament apartamentInWarsaw = new Apartament("Warsaw",65,12000);
        Apartament apartamentInCracow = new Apartament("Warsaw",25,8000);
        Apartament apartamentInStalowaWola = new Apartament("Stalowa Wola",89,4000);

        double Warsaw = apartamentInWarsaw.getFullPrice();
        double Cracow = apartamentInCracow.getFullPrice();
        double StalowaWola = apartamentInStalowaWola.getFullPrice();

        System.out.println("Apartament in Warsaw costs : " + Warsaw);
        System.out.println("Apartament in Cracow costs : " + Cracow);
        System.out.println("Apartament in Stalowa Wola costs : " + StalowaWola);










    }
}
