class Main {
    public static void main(String[] args) {
        Product[] products ={ new Product(1, "ヨクアタール", "命中率が上がる", 550, 99, "戦闘用", "デボンコーポレーション", "", 5, true),
            new Product(2, "プラスパワー", "攻撃力が上がる", 550, 99, "戦闘用", "デボンコーポレーション", "", 5, true),
            new Product(3, "ディフェンダー", "防御力が上がる", 550, 99, "戦闘用", "デボンコーポレーション", "", 5, true),
            new Product(4, "スペシャルアップ", "特殊攻撃力が上がる", 550, 99, "戦闘用", "デボンコーポレーション", "", 5, true),
            new Product(5, "スペシャルガード", "特殊防御力が上がる", 550, 99, "戦闘用", "デボンコーポレーション", "", 5, true),
            new Product(6, "タウリン", "攻撃力が上がる", 9800, 99, "戦闘用", "デボンコーポレーション", "", 5, true),
            // 引数が足りない
            new Product(7, "ブロムヘキシン", "防御力が上がる", 9800, 99, "戦闘用", "デボンコーポレーション", 5, true),
            new Product(8, "リゾチウム", "特殊攻撃力が上がる", 9800, 99, "戦闘用", "デボンコーポレーション", "", 5, true),
            new Product(9, "キトサン", "特殊防御力が上がる", 9800, 99, "戦闘用", "デボンコーポレーション", "", 5, true),
            new Product(10, "インドメタシン", "素早さが上がる", 9800, 99, "戦闘用", "デボンコーポレーション", "", 5, true),
        };
        for (Product product : products){ 
            System.out.println(product);
        }
    }
}

class Product {
    private int id; // 商品ID
    private String name; // 商品名
    private String description; // 商品説明
    private int price; // 価格
    private int stock; // 在庫数
    private String category; // カテゴリ
    private String brand; // ブランド
    private String imageUrl; // 画像URL
    private double rating; // 評価
    private boolean isFeatured; // おすすめフラグ

    // コンストラクタ
    public Product(int id, String name, String description, int price, int stock, String category, String brand, String imageUrl, double rating, boolean isFeatured) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
        this.brand = brand;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.isFeatured = isFeatured;
    }

    public String toString() {
                return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", rating=" + rating +
                ", isFeatured=" + isFeatured +
                '}';
    }

}
