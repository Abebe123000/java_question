class Main {
    public static void main(String[] args) {
        Messager messager = new Messager("aaa");
        messager.printMessage();
    }
}


class Messager {
    // コンストラクタを実装する
    // public Messager(String str) {
    //     message = str;
    // }
    private String message;
    void printMessage() {
        System.out.println(message);
    }
}
