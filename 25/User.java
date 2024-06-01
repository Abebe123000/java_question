import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // ユーザー情報をファイルに保存するメソッド
    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt"))) {
            writer.write("Name: " + name + "\n");
            writer.write("Email: " + email + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}