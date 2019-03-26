package creational.factory_method;

public class FactoryDesign {

public static void  main(String args[]){

    Client client  = new Client(2);
    client.getVehicle().print();
}
}
