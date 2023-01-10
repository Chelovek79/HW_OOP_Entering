public class Main {

    public static void main(String[] args) {

        Automobile car1 = new Automobile("", "Mark II", 3.0,
                "White Pearl",1992, "Япония");

        Automobile car2 = new Automobile("Audi",null, 3.0,
                "Чёрный",2020, "Германия");

        Automobile car3 = new Automobile("BMW", "Z8", 3.0,
                " ", 2021, "Германия");

        Automobile car4 = new Automobile("Kia", "Sportage IV", -2,
                "Красный", 2018, "Южная Корея");

        Automobile car5 = new Automobile("Hyundai", "Avante", 1.6,
                "Оранжевый", 0, "");

        System.out.println(car1 + "\n" + car2 + '\n' + car3 + '\n' + car4 + '\n' + car5);

    }
}