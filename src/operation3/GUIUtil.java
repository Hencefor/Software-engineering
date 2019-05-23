package operation3;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
/**   
* @Title:GUIUtil
* @Package:  operation3
* @Description: This class only used for test. 
* @author Group 88
* @date 2019.05.18
* @version V1.0   
*/
public class GUIUtil {
    public static void toCenter(Component comp) {
        GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
        Rectangle rec=ge.getDefaultScreenDevice().getDefaultConfiguration().getBounds();
        comp.setLocation(((int)(rec.getWidth()-comp.getWidth())/2),
                ((int)(rec.getHeight()-comp.getHeight()))/2);

    }
}
