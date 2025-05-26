Class and Object Creation:


class Car {
    String make, model; int year;
    Car(String m, String mo, int y) { make = m; model = mo; year = y; }
    void displayDetails() { System.out.println(make + " " + model + " " + year); }
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla", 2020); c.displayDetails();
    }
}