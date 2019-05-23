package JunitTest1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operation3.AccountValidatorUtil;

/**   
* @Title:JunitTest1
* @Package: JunitTest1
* @Description: This class used to test some data. 
* @author Group 88
* @date 2019.05.18
* @version V1.0   
*/
class JunitTest1{

	String email1 = "123";
    String email2 = "cao@163.com";
    String email3 = "caoshencheng";

    String name="123";

    /** This method is used to check if the email format is right.
	 *@return void
	 *@throw: Exception
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
    /** This method is used to check if the name format is right.
	 *@return void
	 *@throw: Exception
	 */
    @Test
    public void isname() throws Exception {
        assertTrue(AccountValidatorUtil.isUsername(name));
    }

}
