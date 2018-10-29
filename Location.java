import java.util.Random;

public class Location implements  LocationAPI{

    final int fieldSize = 5;
    private int xPosition;
    private char yPosition;

    public Location(){
        xPosition = -1;
        yPosition = '*';
    }

    public int getxPosition(){
        return xPosition;
    }

    public char getyPosition() {
        return yPosition;
    }

    public void pick(){
        Random random = new Random();
        String alpha = "abcde";

        xPosition = random.nextInt(4)+1;
        yPosition = alpha.charAt(random.nextInt(5));
    }

    public void fire(){
        System.out.println("Enter the coordinates of where you want to fire: ");
    }
    public void print(){
        System.out.print(yPosition + "" + xPosition);
    }


}
