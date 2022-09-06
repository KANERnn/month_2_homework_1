public class Mercedes extends Car {
    private String modelCar;
    private int mileage;

    public int getMileage() {
        return mileage;
    }

    public String getModelCar() {
        return modelCar;
    }

    public Mercedes(String model, double volume, int year) {
        super(model, volume, year);
    }

    public Mercedes(String model, double volume, int year, String modelCar) {
        super(model, volume, year);
        this.modelCar = modelCar;
    }

    public Mercedes(String model, double volume, int year, String modelCar, int mileage) {
        super(model, volume, year);
        this.modelCar = modelCar;
        this.mileage = mileage;
    }
}
