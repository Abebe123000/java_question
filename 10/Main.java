class Main {
    public static void main(String[] args) {
        Messager messager = new Messager("aaa");
        messager.printMessage();
    }
}


class Messager {
    private String message;
    Messager(String str) {
        message = str;
    }
    static void printMessage() {
        System.out.println(message);
    }
}
