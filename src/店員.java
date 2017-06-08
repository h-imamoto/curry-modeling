import menu.カレーソース;
import menu.カレーメニュー;
import menu.カレーメニューID;
import menu.トッピング;
import order.注文ID;
import order.注文票;

import java.util.List;

public class 店員 {

    private 注文票 chuumonnhyou = null;

    public void いらっしゃいませ(注文ID orderId) {
        System.out.println("いらっしゃいませ");
        this.chuumonnhyou = new 注文票(orderId);
    }

    public void 注文を受ける(カレーメニューID curryMenuId, カレーソース source, List<トッピング> toppingList) {
        カレーメニュー curryMenu = new カレーメニュー(curryMenuId, source, toppingList);
        if (chuumonnhyou == null) {
            throw new RuntimeException("お客さんいない");
        }
        chuumonnhyou.add(curryMenu);
    }
}
