class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "ヨクアタール", "命中率が上がる", 550, 99, "戦闘用", "デボンコーポレーション", "", 5, true);
        product.setDescription("攻撃力を上げる");
        product.setPrice(1000);
        product.setBrand("道具");
        product.setCategory("タマムシデパート");
        product.setImageUrl("http://hoge.co.jp/hoge");
        product.addStock(3);
        product.removeStock(5);
        product.applyDiscount(5);
        // なぜ price が 950 にならない？
        System.out.println(product);
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // 在庫管理メソッド
    public void addStock(int quantity) {
        if (quantity > 0) {
            this.stock += quantity;
        }
    }

    public boolean removeStock(int quantity) {
        this.setPrice(500);
        if (quantity > 0 && quantity <= this.stock) {
            this.stock -= quantity;
            return true;
        } else {
            return false;
        }
    }

    // 価格操作メソッド
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            int oldPrice = this.price;
            this.price = (int) (this.price * (1 - discountPercentage / 100));
        }
    }

    public void applyTax(double taxRate) {
        if (taxRate > 0) {
            int oldPrice = this.price;
            this.price = (int) (this.price * (1 + taxRate / 100));
        }
    }

    // 商品情報メソッド
    public String getShortDescription() {
        return name + " - " + category + " (" + brand + ")";
    }

    public String getStockStatus() {
        if (stock > 10) return "In Stock";
        else if (stock > 0) return "Low Stock";
        else return "Out of Stock";
    }

    public boolean isRecommended() {
        return isFeatured && rating >= 4.0;
    }

    // 比較メソッド
    public boolean isCheaperThan(Product other) {
        return this.price < other.price;
    }

    public boolean hasBetterRatingThan(Product other) {
        return this.rating > other.rating;
    }

    public String compareWith(Product other) {
        StringBuilder result = new StringBuilder();
        result.append("Comparing " + this.name + " with " + other.name + ":\n");
        result.append("  - Price: " + (isCheaperThan(other) ? "Cheaper" : "More expensive") + "\n");
        result.append("  - Rating: " + (hasBetterRatingThan(other) ? "Better" : "Worse") + "\n");
        result.append("  - Category: " + (this.category.equals(other.category) ? "Same" : "Different") + "\n");
        return result.toString();
    }

    // クローンメソッド（簡易版）
    public Product clone() {
        return new Product(this.id, this.name, this.description, this.price, this.stock, 
                            this.category, this.brand, this.imageUrl, this.rating, this.isFeatured);
    }
}
