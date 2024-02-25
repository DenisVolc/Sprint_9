import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AccountNoSpaceTest {

    @Test
    public void noSpaceAccountTest(){
        Account account = new Account("AlexanderPlushev");
        assertFalse(account.checkNameToEmboss());
    }

}
