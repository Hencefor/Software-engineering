package JunitTest1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operation3.AccountValidatorUtil;

class dateTestTest {

	String email1 = "123";
    String email2 = "cao@163.com";
    String email3 = "caoshencheng";

    String name="123";

    @Test
    public void isEmailLegal2() throws Exception {
        assertTrue(AccountValidatorUtil.isEmail(email2));
    } 
    @Test
    public void isEmailLegal1() throws Exception {
        assertTrue(AccountValidatorUtil.isEmail(email1));
    }
    @Test
    public void isEmailLegal3() throws Exception {
        assertTrue(AccountValidatorUtil.isEmail(email3));
    }
    @Test
    public void isname() throws Exception {
        assertTrue(AccountValidatorUtil.isUsername(name));
    }

}
