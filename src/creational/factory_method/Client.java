package creational.factory_method;

public class Client {
    private Vehicle vehicle;
    private  int type;

    public Client(int type) {
        this.type = type;
        switch (type){

            case 1 :
                vehicle  =  new TwoWheeler();
                break;
            case  2 :
                vehicle  =  new FourWheeler();
                break;
                default:
                    vehicle =null;
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
