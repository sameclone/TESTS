package simulatejini;

import javax.swing.*;
import java.io.Serializable;

/**
 * Created by yevgeniya.zuyeva on 27.12.2016.
 */
public interface Service extends Serializable {
    public JPanel getGuiPanel();
}
