public class ExamResult {
    public static void main(String[] args) {
        int studentGrade = 85; // 学生の点数

        if (studentGrade >= 60) {
            String resultMessage = "Pass"; // 合格
            System.out.println("Result: " + resultMessage);
        } else {
            String resultMessage = "Fail"; // 不合格
            System.out.println("Result: " + resultMessage);
        }
    }
}