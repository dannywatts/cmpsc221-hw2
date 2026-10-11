package p5_inheritance;

public class Email extends Document {
    // Variables
    private String sender;
    private String recipient;
    private String title;

    // Constructors
    public Email() {}
    public Email(String sender, String recipient, String title, String text) {
        this.sender = sender;
        this.recipient = recipient;
        this.title = title;
        super(text);
    }

    // Accessors
    public String getSender() {return sender;}
    public String getRecipient() {return recipient;}
    public String getTitle() {return title;}

    // Mutators
    public void setSender(String sender) {this.sender = sender;}
    public void setRecipient(String recipient) {this.recipient = recipient;}
    public void setTitle(String title) {this.title = title;}

    // toString
    @Override
    public String toString() {return sender + " " + recipient + " " + title + " " + text;}
}
