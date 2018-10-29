public class Fleet {

    private int fleetSize = 5;
    private Ship[] ships = new Ship[fleetSize];


    public boolean isOperational(){
        for (Ship ship:ships){
            if(!ship.isSunk())
                return true;
        }
        return false;
    }

    public boolean isHitnSunk(Location location){
        for(int i = 0; i<fleetSize; i++){
            if(ships[i].match(location)){
                ships[i].sink();
                return true;
            }
        }
        return false;
    }

    public void printFleet(){
        for(int i = 0; i<fleetSize - 1; i++)
            ships[i].printShip();
    }

    public int check(Location location){
        for(int i = 0; i<fleetSize; i++)
            if(ships[i].match(location))
               return i;

        return -1;
    }

}
