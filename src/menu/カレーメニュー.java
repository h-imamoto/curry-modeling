package menu;

import java.util.ArrayList;
import java.util.List;

public class カレーメニュー {

    private final カレーメニューID id;

    private final カレーソース source;

    private final List<トッピング> toppingList;

    public カレーメニュー(カレーメニューID id, カレーソース source, List<トッピング> toppingList) {
        this.id = id;
        this.source = source;
        this.toppingList = toppingList;
    }
}
