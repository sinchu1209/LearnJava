
import java.util.Objects;

class Laptop {

    String model;
    int price;

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }

    public boolean equals(Laptop that) {
        if (this.model.equals(that.model) && this.price == that.price) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.model);
        hash = 23 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laptop other = (Laptop) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

}

public class ObjClasstoString {

    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo";
        obj1.price = 7000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo";
        obj2.price = 7000;

        boolean result = obj1 == obj2;  //it return false
        boolean result1 = obj1.equals(obj2);
        System.out.println(obj1);
        System.out.println(result);  // by default toString() method will be there
        System.out.println(result1);
    }
}
