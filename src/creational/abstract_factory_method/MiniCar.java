package creational.abstract_factory_method;

class MiniCar extends Car
{
    MiniCar(Location location)
    {
        super(CarType.MINI,location );
        construct();
    }

    @Override
    void construct()
    {
        System.out.println("Connecting to Mini car");
    }
}
