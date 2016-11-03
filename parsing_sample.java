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

