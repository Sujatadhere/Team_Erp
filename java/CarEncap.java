class Car {
    private String model;
    private int speed;
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed! (0 - 200 allowed)");
        }
    }
}

public class CarEncap {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("Honda City");
        c.setSpeed(180);

        System.out.println("Car Model: " + c.getModel());
        System.out.println("Car Speed: " + c.getSpeed() + " km/h");
    }
}

    

