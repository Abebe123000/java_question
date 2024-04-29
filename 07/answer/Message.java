class Message {
    public static void main(String[] args) {
        printMessage();
    }

    // static を追加する
    void printMessage() {
        String message = "aaa";
        message += "bbb";
        message += "ccc";
        message += "ddd";
        System.out.println(message);
    }
}

