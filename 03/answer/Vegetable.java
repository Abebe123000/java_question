class Vegetable {
    public static void main(String[] args) {
        printVegetable();
    }

    static void printVegetable() {
        // String[] にする
        String vegetables = {
            "Cabbage",
            "Broccoli",
            "Cauliflower",
            "Cucumber",
        };
        for (String vegetable: vegetables) {
            System.out.println(vegetable);
        }
    }
}

