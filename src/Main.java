public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("E500 ",  3.5,2002," Седан");
        System.out.println(truck.getInfo());
        Truck truck1 = new Truck("G63", 5.5, 2020," Jeep ", 10000);
        System.out.println(truck1.getInfo());
    }

}