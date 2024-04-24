class Meat {
    public static void main(String[] args) {
        printMeat();
    }

    static void printMeat() {
        String[] meats = {
            "beef",
            "chicken",
            "lamb",
            "pork",
        };
        // <= を < にする
        for (int i = 0; i <= meats.length; i++) {
            System.out.println(meats[i]);
        }
    }
}

