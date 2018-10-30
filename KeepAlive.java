import java.awt.MouseInfo;
import java.awt.Robot;
import java.util.Random;

public class KeepAlive {
    public static final int FIVE_SECONDS = 5000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();
        while (true) {
        	int x = MouseInfo.getPointerInfo().getLocation().x;
        	int y = MouseInfo.getPointerInfo().getLocation().y;
        	for(int i=0; i<5; i++)
        	{
            	x = MouseInfo.getPointerInfo().getLocation().x;
            	y = MouseInfo.getPointerInfo().getLocation().y;
                robot.mouseMove(x+random.nextInt(5)-2, y+random.nextInt(5)-2);
        	}
            Thread.sleep(FIVE_SECONDS);
        }
    }
}