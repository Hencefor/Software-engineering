package JunitTest1;
/**   
* @Title:JunitTest1
* @Package: JunitTest1
* @date 2019.05.18
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operation3.AccountValidatorUtil;

/**   
* This class used to test some data. 
* @author Group 88
* @version V1.0   
*/
class JunitTest1{

	String email1 = "123";
    String email2 = "cao@163.com";
    String email3 = "caoshencheng";

    String name="123";

    /** 
     * This method is used to check if the email format is right.
	 *@throws: Exception
	 */
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
    /** 
     * This method is used to check if the name format is right.
	 *@throws: Exception
	 */
    @Test

    public void isname() throws Exception {
        assertTrue(AccountValidatorUtil.isUsername(name));
    }

}
