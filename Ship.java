public class Ship implements ShipAPI{

    Location location;
    boolean sunk;

    public Ship(){
        location = new Location();
        location.pick();
        sunk = false;
    }

    public boolean match(Location location){
        boolean xMatch = (this.location.getxPosition() == location.getxPosition());
        boolean yMatch = (this.location.getyPosition() == location.getyPosition());

        return  (xMatch && yMatch);
    }

    public boolean isSunk(){
        return sunk;
    }

    public void sink(){
        sunk = true;
    }

    public void setLocation(Location location){
        this.location = location;
    }

    public void printShip(){
        location.print();
        if(sunk)
            System.out.print(" sunk,");
        else
            System.out.print(" up,");
    }



}
