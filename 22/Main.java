class Main {
    public static void main(String[] args) {
        System.out.println(isEven(2));
    }

    static boolean isEven(int num) {
        boolean result = false;
        if (num % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

