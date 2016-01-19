import java.awt.*;

/**
 * Created by kanapysh on 18.01.16.
 */
public class homew_RGB {
    public static void main (String []args)
    {
        Color rgb = new Color(0xeeffcc, true);

        System.out.println("Red = "+rgb.getRed());
        System.out.println("Green = "+rgb.getGreen());
        System.out.println("Blue = "+rgb.getBlue());

        // Calculate RGB
        int rgb1 = 0xeeffcc; // color in RGB
        int r = (rgb1 & 0xFF0000)>>16;
        int g = (rgb1 & 0x00FF00)>>8;
        int b = (rgb1 & 0x0000FF);

        // results R, G and B
        System.out.println("HEX color: 0x" + Integer.toHexString(rgb1));
        System.out.println("RGB color:"+ "  R = " + r + "  G = " + g + "  B = " + b);

    }

}
