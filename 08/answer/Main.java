class Main {
    public static void main(String[] args) {
        Messager messager = new Messager();
        // getter を追加するなど
        messager.message = "aaa";
        messager.printMessage();
    }
}


class Messager {
    private String message;
    void printMessage() {
        System.out.println(message);
    }
}
