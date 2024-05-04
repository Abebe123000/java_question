class Main {
    public static void main(String[] args) {
        // 2000 になってほしい
        System.out.println(priceCaluculator.caluculatePrice(15, false));
    }
}

class priceCaluculator {
    static int caluculatePrice(int age, boolean useCoupon) {
        int price = 2000;
        if (age < 10) {
            price -= 1000;
        }
        if (age >= 65) {
            price -= 500;
        }
        if (useCoupon = true) {
            price -= 300;
        }
        return price;
    }

}
