public class NotificationAdditionalVO {

    private String notificationXML;
    private String gftXML;

    public NotificationAdditionalVO() {
    }

    public NotificationAdditionalVO(String notificationXML, String gftXML) {
        this.notificationXML = notificationXML;
        this.gftXML = gftXML;
    }

    public String getNotificationXML() {
        return notificationXML;
    }

    public void setNotificationXML(String notificationXML) {
        this.notificationXML = notificationXML;
    }

    public String getGftXML() {
        return gftXML;
    }

    public void setGftXML(String gftXML) {
        this.gftXML = gftXML;
    }

    @Override
    public String toString() {
        return "NotificationAdditionalVO{" +
                "notificationXML='" + notificationXML + '\'' +
                ", gftXML='" + gftXML + '\'' +
                '}';
    }
}
