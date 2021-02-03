package creational.builder;

public class BuilderMainClass {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car sportsCar = carBuilder.getResult();
        System.out.println("Car: "+ sportsCar.toString());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSUV(carManualBuilder);

        CarManual suvManual = carManualBuilder.getResult();
        System.out.println("Car Manual: "+ suvManual.toString());
    }
}
