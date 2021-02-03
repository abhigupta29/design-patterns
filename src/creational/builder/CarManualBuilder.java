package creational.builder;

public class CarManualBuilder implements Builder {

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

    public CarManual getResult() {
        return new CarManual(carType, transmissionType, seats, engine);
    }
}
