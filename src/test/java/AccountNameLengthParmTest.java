import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountNameLengthParmTest {
    //todo рикрутить junit
    //todo прикрутить Jacoco
    //
    private String name;
    private boolean expected;

    public AccountNameLengthParmTest(String name, boolean result) {
        this.name = name;
        this.expected = result;
    }

    @Parameterized.Parameters
    public static  Object[][] testNames(){
        return new Object[][]{
                {"A L",true},
                {"A Li",true},
                {"AL",false},
                {"Alexander Lutishev",true},
                {"Alexandra Lutisheva",true},
                {"Alexandra Lutisheeva",false},
        };
    }
    @Test
    public void accountTest(){
        Account account = new Account(name);
        assertEquals(expected, account.checkNameToEmboss());
    }

}
