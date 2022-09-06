public class Car {
    private String model;
    private double volume;
    private int year;

    public Car(String model, double volume, int year) {
        this.model = model;
        this.volume = volume;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public double getVolume() {
        return volume;
    }

    public int getYear() {
        return year;
    }
    public String getInfo(){
        return "Модель: " + getModel() + "Год: " + getYear();
    }
}
