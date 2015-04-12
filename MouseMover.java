import java.awt.Robot;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Point;

public class MouseMover {
    public static final int WAIT_TIME_IN_SECONDS = 50000; //50 seconds
    public static final int MOVE_MOUSE_BY_PIXEL = 1; //Move mouse by pixel

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        while (true) {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		int y = (int) b.getY();

		robot.mouseMove(x + MOVE_MOUSE_BY_PIXEL, y + MOVE_MOUSE_BY_PIXEL);
		System.out.println("x = " + x + MOVE_MOUSE_BY_PIXEL + ", y = " + y + MOVE_MOUSE_BY_PIXEL);
		Thread.sleep(WAIT_TIME_IN_SECONDS);
        }
    }
}
