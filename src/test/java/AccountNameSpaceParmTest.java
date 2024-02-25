import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountNameSpaceParmTest {
    //todo прикрутить Jacoco
    //
    private String name;
    private boolean expected;

    public AccountNameSpaceParmTest(String name, boolean result) {
        this.name = name;
        this.expected = result;
    }
    @Parameterized.Parameters
    public static  Object[][] testNames(){
        return new Object[][]{
                {"Alexander Lutishev ",false},
                {" Alexander Lutishev",false},
                {" Alexander Lutishev ",false},
        };
    }
    @Test
    public void accountSpaceTest(){
        Account account = new Account(name);
        assertEquals(expected, account.checkNameToEmboss());
    }

}
