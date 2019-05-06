public interface InternetConnection extends Server {
    public boolean checkConnection();
    public boolean getConnected();
    public boolean getDisconnected();
    public String parseXML(String url);
    public String parseJSON(String url);
    public String downloadPageContent(String url);

}
