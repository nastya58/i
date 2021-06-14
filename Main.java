package com.company;

public class Main {

    public static void main(String[] args) {
        Factory air = new AirLogistic();
        Factory sea = new SeaLogistic();
        Factory road = new RoadLogistic();
        Transport airplane = air.createTransport();
        Transport ship = sea.createTransport();
        Transport tank = road.createTransport();
        System.out.println(airplane);
        System.out.println(ship);
        System.out.println(tank);
    }
}
    abstractclassTransport{
        String name;
        public String toString(){
            if (name.equals("TITANIK")){
                return name + " POTONUL";
            }
            if (name.equals("IL-2")){
                return name + " PROLETEL";
            }
            else {
                return name + " PROEHAL";
            }
        }
    }
    abstractclassFactory{
    public  abstractTransport ();
    }
class SeaLogistic extends Factory{
    public Transport createTransport(){
        return new SeaTransport();
    }
}
class AirLogistic extends Factory{
    public Transport createTransport(){
        return new AirTransport();
    }
}
class RoadLogistic extends Factory{
    public Transport createTransport(){
        return new RoadTransport();
    }
}
class RoadTransport extends Transport{
    public RoadTransport(){
        name = "KV-2";
    }
}
class SeaTransport extends Transport{
    public SeaTransport(){
        name = "TITANIK";
    }
}
class AirTransport extends Transport{
    public AirTransport(){
        name = "IL-2";
    }
}