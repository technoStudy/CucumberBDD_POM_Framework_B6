package POM;

import org.openqa.selenium.support.PageFactory;

public class NavigationBarElements extends BasePOM {

    public NavigationBarElements() {
        PageFactory.initElements(driver, this);
    }

}
