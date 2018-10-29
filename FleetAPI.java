public interface FleetAPI {
    void deployFleet();
    //Deploys the fleet in random locations

    boolean isOperational();
    //Return true if at least one ship in fleet is not sunk

    boolean isHitnSunk(Location location);
    //Return true if ship is at location and sinks it. Otherwise return false

    void printFleet();
    //Print out the locations of ships in fleet

    int check(Location location);
    //Return index of the ship at location
}
