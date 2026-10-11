package p5_inheritance;

public class Main {
    static void main() {
        Email e1 = new Email("dannywatts@psu.edu", "dannywatts@psu.edu", "Note to self", "Hello, world!");
        Email e2 = new Email("dannywatts@psu.edu", "dannywatts@psu.edu", "Foo", "Bar");
        File f1 = new File("C:\\Users\\danny\\Documents\\hello.txt", "World!");
        File f2 = new File("C:\\Users\\danny\\Documents\\foo.txt", "bar");
        System.out.printf("Email 1:\n%s\n", e1);
        System.out.printf("Email 2:\n%s\n", e2);
        System.out.printf("File 1:\n%s\n", f1);
        System.out.printf("File 2:\n%s\n", f2);
        System.out.printf("Does email 1 contain world? %b\n", containsKeyword(e1, "world"));
        System.out.printf("Does file 2 contain world? %b\n", containsKeyword(f2, "world"));
    }

    public static boolean containsKeyword(Document document, String keyword) {
        return document.toString().contains(keyword);
    }
}
