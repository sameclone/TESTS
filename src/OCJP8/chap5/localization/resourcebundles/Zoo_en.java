package OCJP8.chap5.localization.resourcebundles;

import java.util.ListResourceBundle;

/**
 * Created by yevgeniya.zuyeva on 23.01.2017.
 */
public class Zoo_en extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"hello", "Hello"}, {"open", "The zoo is open"}};
    }
}
