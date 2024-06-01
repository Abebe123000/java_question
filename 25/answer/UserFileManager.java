// ユーザーデータをファイルに保存する責任を持つクラス
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserFileManager {
    public void saveToFile(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt"))) {
            writer.write("Name: " + user.getName() + "\n");
            writer.write("Email: " + user.getEmail() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}