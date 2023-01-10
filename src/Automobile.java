public class Automobile {

    String brand;
    String model;
    double engineVolume;
    String colour;
    int productionYear;
    String productionCountry;

    @Override
    public String toString() {
        return brand +" " + model + '\n' +
                "\t объём двигателя - " + engineVolume + " л\n " +
                "\t цвет кузова - '" + colour + "'\n" +
                "\t год выпуска - " + productionYear + "г.\n" +
                "\t страна сборки - '" + productionCountry + "'";
    }
}
