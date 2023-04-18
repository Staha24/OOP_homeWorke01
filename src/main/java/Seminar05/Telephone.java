package Seminar05;

import java.util.Objects;

public class Telephone {
    private  String name;
    private int qualityAkb;
    private double sizeDisplay;
    private  String model;
    private String typeOs;
    private double price;

    public Telephone(String name, int qualityAkb, double sizeDisplay, String model, String typeOs, double price) {
        this.name = name;
        this.qualityAkb = qualityAkb;
        this.sizeDisplay = sizeDisplay;
        this.model = model;
        this.typeOs = typeOs;
        this.price = price;
    }

    public Telephone() {

    }

    public String getName() {
        return name;
    }

    public int getQualityAkb() {
        return qualityAkb;
    }

    public double getSizeDisplay() {
        return sizeDisplay;
    }

    public String getModel() {
        return model;
    }

    public String getTypeOs() {
        return typeOs;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null||getClass() != o.getClass()) return false;
        Telephone telephone = (Telephone) o;
        return getQualityAkb() == telephone.getQualityAkb() && Double.compare(telephone.getSizeDisplay(), getSizeDisplay()) == 0 && Double.compare(telephone.getPrice(), getPrice()) == 0 && Objects.equals(getName(), telephone.getName()) && Objects.equals(getModel(), telephone.getModel()) && Objects.equals(getTypeOs(), telephone.getTypeOs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getQualityAkb(), getSizeDisplay(), getModel(), getTypeOs(), getPrice());
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "name='" + name + '\'' +
                ", qualityAkb=" + qualityAkb +
                ", sizeDisplay=" + sizeDisplay +
                ", model='" + model + '\'' +
                ", typeOs='" + typeOs + '\'' +
                ", price=" + price +
                '}';
    }
}
