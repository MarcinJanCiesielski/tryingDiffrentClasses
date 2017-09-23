package robot;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotTry {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        int[] text = {KeyEvent.VK_H, KeyEvent.VK_E, KeyEvent.VK_L, KeyEvent.VK_L, KeyEvent.VK_O, KeyEvent.VK_SPACE,
                KeyEvent.VK_W, KeyEvent.VK_O, KeyEvent.VK_R, KeyEvent.VK_L, KeyEvent.VK_D, KeyEvent.VK_ENTER};

        for (int i = 0; i < 5; i++) {
            robot.mouseMove(0,0);
            robot.mousePress(InputEvent.BUTTON2_MASK);
            robot.delay(2000);
            robot.mouseRelease(InputEvent.BUTTON2_MASK);
            for (int j = 0; j < 201; j+=10) {
                robot.mouseMove(j,j);
                robot.delay(1000);
            }
            for(int k=0; k<text.length; k++) {
                robot.keyPress(text[k]);
                robot.keyRelease(text[k]);
                robot.delay(200);
            }
        }
    }
}
