package menu;

public enum メニュー表 {

    ポーク(カレーソース.ポーク, new 単価(100)),
    ささみ(肉類.ささみ, new 単価(100));

    private final メニュー menu;

    private final 単価 price;

    メニュー表(メニュー menu, 単価 price) {
        this.menu = menu;
        this.price = price;
    }
}
