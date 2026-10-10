package p5_inheritance;

public class File extends Document {
    private String path;

    @Override
    public String toString() {return path + " " + text;}
}
