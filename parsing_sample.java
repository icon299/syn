public static boolean ip(String text) {
    Pattern p = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
    Matcher m = p.matcher(text);
    return m.find();
}

    public boolean ip(String a_text) {
    String ip_filter = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
    if (a_text.toLowerCase().contains(ip_filter.toLowerCase())){
        return true;
    }
    return false;
}


boolean isValid = InetAddresses.isInetAddress("1.2.3.4");

package com.mkyong.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidator{

    private Pattern pattern;
    private Matcher matcher;

    private static final String IPADDRESS_PATTERN = 
        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public IPAddressValidator(){
      pattern = Pattern.compile(IPADDRESS_PATTERN);
    }

   /**
    * Validate ip address with regular expression
    * @param ip ip address for validation
    * @return true valid ip address, false invalid ip address
    */
    public boolean validate(final String ip){         
      matcher = pattern.matcher(ip);
      return matcher.matches();             
    }
}


public static String extractIP(String s) {
    java.util.regex.Matcher m = java.util.regex.Pattern.compile(
        "(?<!\\d|\\d\\.)" +
        "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])" +
        "(?!\\d|\\.\\d)").matcher(s);
    return m.find() ? m.group() : null;
}
That will return the IP if one is found in the string, or null otherwise.

To check simply if it contains an IP, do if (extractIP(str) != null)
