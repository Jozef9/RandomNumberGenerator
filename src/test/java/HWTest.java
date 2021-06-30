import org.junit.jupiter.api.*;

public class HWTest {
    public void test_Hello_World_Test(){
        //arrange
        //act
        String tester= HelloWorld.getMessage;
        //assert
        Assertions.assertEquals("hello world", tester);
    }
}
