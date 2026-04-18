import java.io.FileWriter;
import java.io.IOException;

class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\User\\OneDrive\\Documents\\example.txt", true);
            fw.write("\nAppending new line!");
            fw.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}