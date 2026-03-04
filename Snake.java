import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Snake {
    public static void main(String[] args) {
        try {
            int i = 0;
            while (true)
            {
            i++;
            Robot robot = new Robot();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Rectangle screenRect = new Rectangle(screenSize);
            BufferedImage capture = robot.createScreenCapture(screenRect);
            File outputFile = new File("./screenshot" + i + ".png");
            String format = "png";
            ImageIO.write(capture, format, outputFile);

            System.out.println("Screenshot saved to: " + outputFile.getAbsolutePath());
            }

        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
    }
}
