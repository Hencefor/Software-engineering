package operation3;
/**   
* @Title:AccountValidatorUtil
* @Package:  operation3
* @date 2019.05.18
*/
import java.util.regex.Pattern;
/**   
 * This class defines the method to validate the input format. 
* @author Group 88
* @version V1.0   
*/
public class AccountValidatorUtil {
    /**
     * 
     */
    public static final String REGEX_USERNAME = "^[a-zA-Z]{3,20}$";
 
    /**
     * 
     */
    public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,20}$";
 
    /**
     * 
     */
    public static final String REGEX_MOBILE = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
 
    /**
     *
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
 
    /**
     * 
     */
    public static final String REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";
 
    /**
     * 
     */
    public static final String REGEX_ID_CARD = "(^\\d{9}$)";
 
    /**
     * 
     */
    public static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
 
    /**
     * 
     */
    public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
 
    /** This method is used to check if the name format is right.
     *@param username
	 *@return boolean
	 */
    public static boolean isUsername(String username) {
        return Pattern.matches(REGEX_USERNAME, username);
    }
 
    /**
     * This method is used to check if the password is right.
     * @param password
     * @return boolean
     */
    public static boolean isPassword(String password) {
        return Pattern.matches(REGEX_PASSWORD, password);
    }
 
    /**
     * This method is used to check if the phone number format is right.
     * @param mobile
     * @return boolean
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }
 
    /**
     *This method is used to check if the name format is right.
     * @param email
     * @return boolean
     */
    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }
 
    /**
     * This method is used to check if the String is Chinese.
     * 
     * @param chinese
     * @return boolean
     */
    public static boolean isChinese(String chinese) {
        return Pattern.matches(REGEX_CHINESE, chinese);
    }
 
    /**
     * This method is used to check if the id Card is right.
     * 
     * @param idCard
     * @return boolean
     */
    public static boolean isIDCard(String idCard) {
        return Pattern.matches(REGEX_ID_CARD, idCard);
    }
 
    /**
     * This method is used to check if the URL is right.
     * 
     * @param url
     * @return boolean
     */
    public static boolean isUrl(String url) {
        return Pattern.matches(REGEX_URL, url);
    }
 
    /**
     * This method is used to check if the IP address is right.
     * 
     * @param ipAddr
     * @return boolean
     */
    public static boolean isIPAddr(String ipAddr) {
        return Pattern.matches(REGEX_IP_ADDR, ipAddr);
    }
}