import java.io.File;

public class FileBrowser {
    public static void main(String[] args) {
        try {
            File dir = new File("/home/goodexpert/workspace");
            System.out.println("this is directory : " + dir.isDirectory());
        } catch (Exception ex) {
        }
    }
}
