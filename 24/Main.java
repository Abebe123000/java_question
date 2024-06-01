public class ExamResult {
    public static void main(String[] args) {
        int studentGrade = 85; // 学生の点数
        String resultMessage = "";  // if文の手前で宣言

        if (studentGrade >= 60) {
            resultMessage = "Pass"; // 合格
        } else {
            resultMessage = "Fail"; // 不合格
        }

        System.out.println("Result: " + resultMessage);
    }
}