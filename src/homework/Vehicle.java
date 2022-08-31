package homework;

public class Vehicle {

    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }


    public float maxDistance(float fuel, float fuelUsage, int passengers){
        return fuel / (fuelUsage * (1 + passengers * 0.05f)) * 100;
    }

    public float maxDistance(){
        return fuel / (fuelUsage * (1 + passengers * 0.05f)) * 100;
    }

}
