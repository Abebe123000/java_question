public class Main {
    public static void main(String[] args) {
        int studentGrade = 85; // 学生の点数
        String resultMessage = "";

        if (studentGrade >= 60) {
            resultMessage = "Pass"; // 合格
        } else {
            resultMessage = "Fail"; // 不合格
        }

        System.out.println("Result: " + resultMessage);
    }
}