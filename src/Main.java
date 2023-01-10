public class Main {

    public static void main(String[] args) {

        Automobile car1 = new Automobile();
        car1.brand = "Toyota";
        car1.model = "Mark II";
        car1.engineVolume = 3.0;
        car1.colour = "White Pearl";
        car1.productionYear = 1992;
        car1.productionCountry = "Япония";

        Automobile car2 = new Automobile();
        car2.brand = "Audi";
        car2.model = "A8 50L TDI quattro";
        car2.engineVolume = 3.0;
        car2.colour = "Чёрный";
        car2.productionYear = 2020;
        car2.productionCountry = "Германия";

        Automobile car3 = new Automobile();
        car3.brand = "BMW";
        car3.model = "Z8";
        car3.engineVolume = 3.0;
        car3.colour = "Чёрный";
        car3.productionYear = 2021 ;
        car3.productionCountry = "Германия";

        Automobile car4 = new Automobile();
        car4.brand = "Kia";
        car4.model = "Sportage IV";
        car4.engineVolume = 2.4;
        car4.colour = "Красный";
        car4.productionYear = 2018;
        car4.productionCountry = "Южная Корея";

        Automobile car5 = new Automobile();
        car5.brand = "Hyundai";
        car5.model = "Avante";
        car5.engineVolume = 1.6;
        car5.colour = "Оранжевый";
        car5.productionYear  = 2016;
        car5.productionCountry = "Южная Корея";

        System.out.println(car1 + "\n" + car2 + '\n' + car3 + '\n' + car4 + '\n' + car5);

    }
}