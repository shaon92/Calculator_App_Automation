import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class TestCase {
    public AndroidDriver driver;
    @FindBy(id = "com.google.android.calculator:id/digit_9")
    MobileElement btn9;
    @FindBy(id="com.google.android.calculator:id/op_add")
    MobileElement plus;
    @FindBy(id="com.google.android.calculator:id/digit_5")
    MobileElement btn5;
    @FindBy(id="com.google.android.calculator:id/result_preview")
    MobileElement btnPreview;

    public TestCase(AndroidDriver driver) throws IOException, InterruptedException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String openApp() throws InterruptedException, IOException {
        btn9.click();
        plus.click();
        btn5.click();
        return btnPreview.getText();
    }
}
