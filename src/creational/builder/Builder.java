package creational.builder;

public interface Builder {

    void setCarType(String carType);
    void setTransmissionType(String transmissionType);
    void setSeats(int seats);
    void setEngine(String engine);
}
