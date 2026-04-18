import java.io.FileWriter;
import java.io.IOException;

class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\User\\OneDrive\\Desktop\\demoFile.txt");
            fw.write("Hello, this is Java File Handling!");
            fw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}