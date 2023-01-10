public class Automobile {

    private String brand;
    private String model;
    private double engineVolume;
    private String colour;
    private int productionYear;
    private String productionCountry;

    public Automobile (String brand, String model, double engineVolume, String colour, int productionYear, String productionCountry) {

        if (brand == null || brand.isBlank()) {
            this.brand = "Автомобиль ";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = "";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (colour == null || colour.isBlank()) {
            this.colour = "Белый";
        } else {
            this.colour = colour;
        }

        if (productionYear <=0 ) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = "Made in ...";
        } else {
            this.productionCountry = productionCountry;
        }
    }
    @Override
    public String toString() {
        return brand +" " + model + '\n' +
                "\t объём двигателя - " + engineVolume + " л\n " +
                "\t цвет кузова - '" + colour + "'\n" +
                "\t год выпуска - " + productionYear + "г.\n" +
                "\t страна сборки - '" + productionCountry + "'";
    }
}
