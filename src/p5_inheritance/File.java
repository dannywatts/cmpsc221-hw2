package p5_inheritance;

public class File extends Document {
    // Variables
    private String path;

    // Constructors
    public File() {}
    public File(String path, String text) {
        this.path = path;
        super(text);
    }

    // Accessors
    public String getPath() {return path;}

    // Mutators
    public void setPath(String path) {this.path = path;}

    // toString
    @Override
    public String toString() {return path + " " + text;}
}
