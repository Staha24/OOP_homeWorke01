package Seminar02.task6;

public abstract class Car {
    public  String model;
    public  String color;
    public  int maxSpeed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void Gas(){
        System.out.println(" Поехали");
    }
    public  abstract  void brake();
}
