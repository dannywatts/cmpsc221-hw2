package p5_inheritance;

public class Document {
    // Variables
    protected String text;

    // Constructors
    public Document() {}
    public Document(String text) {this.text = text;}

    // Accessors
    public String getText() {return text;}

    // Mutators
    public void setText(String text) {this.text = text;}

    // toString
    @Override
    public String toString() {return text;}
}
