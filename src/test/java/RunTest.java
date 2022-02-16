import org.junit.*;
import static com.codeborne.selenide.Selenide.open;

public class RunTest
{
    @Before
    public void BeforeClass()
    {
        System.out.println("Before class");
    }

    @After
    public void AfterClass()
    {
        System.out.println("After class");
    }

    @Test
    public void Test1()
    {
        System.out.println("1");
        Assert.assertEquals("A", "A");
    }

    @Test
    public void Test2()
    {
        System.out.println("2");
        Assert.assertEquals("A", "B");
    }

    public static void main()
    {
        open("https://demoqa.com/automation-practice-form");
    }

}

