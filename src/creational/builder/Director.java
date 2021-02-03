package creational.builder;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType("sports car");
        builder.setTransmissionType("automatic");
        builder.setEngine("v8");
        builder.setSeats(2);
    }

    public void constructSUV(Builder builder) {
        builder.setCarType("SUV");
        builder.setTransmissionType("manual");
        builder.setEngine("v8-mega");
        builder.setSeats(8);
    }
}
