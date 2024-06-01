public class DiscountExample {
    public static void main(String[] args) {
        int customerType = 2; // 1: Regular, 2: VIP
        double discount = 0.0; 

        if (customerType == 2) {
            discount = 0.2; // VIP顧客には20%の割引
            System.out.println("Discount applied: " + (discount * 100) + "%");
        } else {
            System.out.println("No discount for regular customers.");
        }

        // 他のコードでdiscountは使用されない
    }
}