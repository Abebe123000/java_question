public class Main {
    public static void main(String[] args) {
        int customerType = 2; // 1: Regular, 2: VIP

        if (customerType == 2) {
            // discount を if 文の中で宣言
            final double discount = 0.2; // VIP顧客には20%の割引
            System.out.println("Discount applied: " + (discount * 100) + "%");
        } else {
            System.out.println("No discount for regular customers.");
        }

        // discountは必要な場合にのみ使用される
    }
}