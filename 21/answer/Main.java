// コード 6-2 改題
class Main {
    public static void main(String[] args) {
        String str = "   boot   ";
        // final をつける
        // 各変数名を変える
        str = str.trim();
        str = str.replace('t', 'k');
        System.out.println(str);
    }
}

