// コード 6-2 改題
class Main {
    public static void main(String[] args) {
        // final をつける
        // 各変数名を変える
        final String str = "   boot   ";
        final String trimedStr = str.trim();
        final String replaced = trimedStr.replace('t', 'k');
        System.out.println(replaced);
    }
}

