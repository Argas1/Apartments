public class Apartament {
    private String city;
    private int surfaceInM2;
    private double priceForM2;

    private final static double DEVELOPER_DISCOUNT = 0.95;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSurfaceInM2() {
        return surfaceInM2;
    }

    public void setSurfaceInM2(int surfaceInM2) {
        this.surfaceInM2 = surfaceInM2;
    }

    public double getPriceForM2() {
        return priceForM2;
    }

    public void setPriceForM2(double priceForM2) {
        this.priceForM2 = priceForM2;
    }

    public Apartament(String city, int surfaceInM2, double priceForM2) {
        this.city = city;
        this.surfaceInM2 = surfaceInM2;
        this.priceForM2 = priceForM2;
    }

    public double getFullPrice(){
        return (surfaceInM2*priceForM2) * DEVELOPER_DISCOUNT;
    }

}
