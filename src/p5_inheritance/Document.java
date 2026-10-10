package p5_inheritance;

public class Document {
    protected String text;

    public void setText(String text) {this.text = text;}

    @Override
    public String toString() {return text;}
}
