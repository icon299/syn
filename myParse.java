/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parseip;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author d.sinyatkin
 */
public class ParseIP {

    public String extractIP(String s) {
    java.util.regex.Matcher m = java.util.regex.Pattern.compile(
        "(?<!\\d|\\d\\.)" +
        "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])" +
        "(?!\\d|\\.\\d)").matcher(s);
    return m.find() ? m.group() : "";
}
public static boolean validIP (String ip) {
    try {
        if ( ip == null || ip.isEmpty() ) {
            return false;
        }

        String[] parts = ip.split( "\\." );
        if ( parts.length != 4 ) {
            return false;
        }

        for ( String s : parts ) {
            int i = Integer.parseInt( s );
            if ( (i < 0) || (i > 255) ) {
                return false;
            }
        }
        if ( ip.endsWith(".") ) {
            return false;
        }

        return true;
    } catch (NumberFormatException nfe) {
        return false;
    }
}
    public String[] splitInputToLines(String inStr ){
        String[] lines = inStr.split("\n"); // разбиваем построчно
        for (String line : lines) {
            int k = 0;
            lines[k] = line.trim();
            //System.out.println(lines[k]);
            k++;
        }
        return lines;
    }
     public String getPairWithIP(String[] splitStr){
//       
//        HashMap<String, String> ipmap = new HashMap<String, String>();
        String sParams;
        String myIP ="sd";
        //String sIP;
         for (String line : splitStr) {
 //          System.out.println(line);
 //          System.out.println(sIP);
            java.util.regex.Matcher m = java.util.regex.Pattern.compile(
            "(?<!\\d|\\d\\.)" +
            "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])" +
            "(?!\\d|\\.\\d)").matcher(line);
          //  myIP = m.find() ? m.group() : "";
           //String sIP = extractIP(line);
           if (!(m.find() ? m.group() : "").isEmpty()) {
            int firstkeyIndex = line.indexOf(myIP.trim());
            sParams = line.substring(myIP.length());
            System.out.println(myIP+ " " + sParams+ "fdfds");
           }

         }
        
         return "dddd";
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParseIP app = new ParseIP();
        String[] splitLines = app.splitInputToLines(" fgfg\n    192.168.101.999 \n     123.123.123.999 fgfdghffggfg\n dsfsdfdsfsdfds");
        String dd = app.getPairWithIP(splitLines);
    
        //String sIP = extractIP(" fgfg 192.168.101.999 \n 123.123.123.999 fgfdghffggfg");
        //boolean isValid = validIP(sIP);
        //if (isValid) {
        //System.out.println(sIP);
        //} else System.out.println("no valid IP found");
    }
    
}
