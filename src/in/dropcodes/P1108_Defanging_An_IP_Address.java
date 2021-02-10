package in.dropcodes;


/**
 * Author : Sagar D B (iamSagarDB)
 * github: https://github.com/iamsagardb
 * <p>
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * <p>
 * A defanged IP address replaces every period "." with "[.]".
 * <p>
 * Example 1:
 * <p>
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 * <p>
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The given address is a valid IPv4 address.
 */

public class P1108_Defanging_An_IP_Address {

    public String defangIPaddr(String address) {
        StringBuilder res = new StringBuilder();
        String dot = ".";
        for (int i = 0; i < address.length(); i++) {
            String c = String.valueOf(address.charAt(i));
            if (c.equals(dot)) {
                res.append("[.]");
            } else {
                res.append(c);
            }
        }
        return res.toString().trim();
    }
}
