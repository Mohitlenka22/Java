//5 a). Create a multilevel inheritance for classes vehicle, brand and cost. The vehicle class
// determines the type of vehicle which is inherited by the class brand which determines the
// brand of the vehicle. Brand class is inherited by cost class, which tells about the cost of
// the vehicle. Create another class which calls the constructor of cost class and method that
// displays the total vehicle information from the attributes available in the super classes.

class Vehicle{
    int type;
    Vehicle(int type)
    {

    }
}
class Brand extends Vehicle{
    String brand;
    Brand(int type, String brand)
    {
        super(type);
    }
}
class Cost extends Brand{
    int cost;
    Cost(int type, String brand, int cost){
        super(type, brand);
        this.type = type;
        this.brand = brand;
        this.cost = cost;

    }
    void displays()
    {
        System.out.println("type: " + this.type + " brand: " + this.brand + " cost: " + this.cost);
    }
}


public class Main{
    public static void main(String[] args) {
        Cost c = new Cost(12, "jaguar", 123567890);
        c.displays();
    }
}
