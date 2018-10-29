public interface ShipAPI {

    boolean match(Location location);
    //Returns true if location matches the input location

    boolean isSunk();
    //Return true if ship is sunk

    void sink();
    //Marks ship as sunk

    void setLocation(Location location);
    //Deploy ship at input location

    void printShip();
    //Print location and status of ship
}
