package com.example;
import org.junit.*;

public class AppTest
{
    @Test
public  void TestAdd()
{
    App app = new App();
    int result = app.add(2,3);
    System.out.println("Running test : "+result);
    Assert.assertEquals(5,result);
}

}
