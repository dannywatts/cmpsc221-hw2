package p5_inheritance;

public class Email extends Document {
    private String sender;
    private String recipient;
    private String title;

    public String getSender() {return sender;}
    public String getRecipient() {return recipient;}
    public String getTitle() {return title;}

    public void setSender(String sender) {this.sender = sender;}
    public void setRecipient(String recipient) {this.recipient = recipient;}
    public void setTitle(String title) {this.title = title;}

    @Override
    public String toString() {return sender + " " + recipient + " " + title + " " + text;}
}
