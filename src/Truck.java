public final class Truck extends Mercedes {
    public Truck(String model, double volume, int year) {
        super(model, volume, year);
    }

    public Truck(String model, double volume, int year, String modelCar) {
        super(model, volume, year, modelCar);
    }

    public Truck(String model, double volume, int year, String modelCar, int mileage) {
        super(model, volume, year, modelCar, mileage);

    }

    @Override
    public String getInfo() {
        return super.getInfo()+ "Кузов" + getModelCar();
    }
}
