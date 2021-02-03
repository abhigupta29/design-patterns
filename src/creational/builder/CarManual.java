package creational.builder;

public class CarManual {

    private String CarType;
    private String transmissionType;
    private int seats;
    private String engine;

    public CarManual(String carType, String transmissionType, int seats, String engine) {
        CarType = carType;
        this.transmissionType = transmissionType;
        this.seats = seats;
        this.engine = engine;
    }

    public String getCarType() {
        return CarType;
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
        return "CarManual{" +
                "CarType='" + CarType + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", seats=" + seats +
                ", engine='" + engine + '\'' +
                '}';
    }
}
