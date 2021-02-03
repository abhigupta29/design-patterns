package creational.builder;

public class CarBuilder implements Builder {

    private String carType;
    private String transmissionType;
    private int seats;
    private String engine;

    @Override
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Car getResult() {
        return new Car(carType, transmissionType, seats, engine);
    }
}
