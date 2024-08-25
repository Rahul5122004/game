class vehicle
{
    String Brand;
    int Year;
    void start()
    {
        System.out.println("Every Vehicle have Engine.");
    }
}
class car extends vehicle
{
    String fueltype;
    void start()
    {
        System.out.println("Car Brand: "+Brand);
        System.out.println("Car year: "+Year);
        System.out.println("This car has a fueltype: "+fueltype);
        System.out.println("Car Engine Start.");
    }
    void Drive()
    {
        System.out.println("Car is Driving.");
    }
}
class truck extends vehicle
{
    String Loadcapacity;
    void start()
    {
        System.out.println("Truck Brand: "+Brand);
        System.out.println("Truck year: "+Year);
        System.out.println("This Truck has a Loadcapacity: "+Loadcapacity);
        System.out.println("Truck Engine Strat");
    }
    void haul()
    {
        System.out.println("Truck is hauling");
    }
}
class task17
{
public static void main(String args[])
{
    car c1=new car();
    c1.Brand="Ford";
    c1.Year=2009;
    c1.fueltype="Petrol";
    c1.start();
    c1.Drive();
    truck t1=new truck();
    t1.Brand="Ashok Leyland";
    t1.Year=2012;
    t1.Loadcapacity="2000 ton";
    t1.start();
    t1.haul();
}
}