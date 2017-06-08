package order;

import menu.カレーメニュー;

import java.util.ArrayList;
import java.util.List;

public class 注文票 {

    private final 注文ID orderId;

    private List<カレーメニュー> curryMenuList;

    public 注文票(注文ID orderId) {
        this.orderId = orderId;
        this.curryMenuList = new ArrayList<>();
    }

    public void add(カレーメニュー curryMenu) {
        curryMenuList.add(curryMenu);
    }
}
