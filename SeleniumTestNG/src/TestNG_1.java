
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class  TestNG_1 {

    @Test(priority = 5)
    public void A()
    {
        System.out.println("hey");
    }
    @Test(priority = 3)
    public void B()
    {
        System.out.println("test1");
    }


}