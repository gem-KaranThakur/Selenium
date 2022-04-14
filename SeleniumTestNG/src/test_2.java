import org.testng.annotations.Test;

public class test_2 {


    @Test(priority = 6)
    public void C()
    {
        System.out.println("i am c");
    }
    @Test(priority = 5)
    public void D()
    {
        System.out.println("i am D");
    }
}
