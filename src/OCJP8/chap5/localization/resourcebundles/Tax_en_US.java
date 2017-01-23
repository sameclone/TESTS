package OCJP8.chap5.localization.resourcebundles;

import java.util.ListResourceBundle;

/**
 * Created by yevgeniya.zuyeva on 23.01.2017.
 */
public class Tax_en_US extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"tax", new UsTaxCode()}};
    }
}
