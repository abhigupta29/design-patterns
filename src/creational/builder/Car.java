package creational.builder;

public class Car {

    private String carType;
    private String transmissionType;
    private int seats;
    private String engine;

    public Car(String carType, String transmissionType, int seats, String engine) {
        this.carType = carType;
        this.transmissionType = transmissionType;
        this.seats = seats;
        this.engine = engine;
    }

    public String getCarType() {
        return carType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                '}';
    }
}
