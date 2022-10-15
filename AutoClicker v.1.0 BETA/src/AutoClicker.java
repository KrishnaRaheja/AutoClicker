import java.awt.*;
import java.awt.event.InputEvent;

public class AutoClicker extends MyFrame{
    public static void main(String[] args) throws Exception {
        try {
            new MyFrame();
            int i = 1;
            Robot r = new Robot();
            int leftClick = InputEvent.BUTTON1_DOWN_MASK;
            Thread.sleep(1500);
            while (true) {
                System.out.println("Click " + i);
                r.mousePress(leftClick);
                Thread.sleep(60);
                r.mouseRelease(leftClick);
                Thread.sleep(60); //Clicks every 0.7 seconds
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

                