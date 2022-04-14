import org.testng.annotations.Test;

public class Group {

    @Test(groups = {"smoky"})
    public void func1()
    {
        System.out.println("func1");
    }
    @Test(groups={"smoky","Regression"})
    public void func2()
    {
        System.out.println("lala");
    }
    @Test(groups={"Regression"})
    public void func3()
    {
        System.out.println("lalala1");
    }


}
