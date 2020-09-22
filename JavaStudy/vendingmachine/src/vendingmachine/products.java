package vendingmachine;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class products {
	List<String> products = new ArrayList<String>();
	Map<String, Integer> drink = new LinkedHashMap<String, Integer>();
	Map<String, Integer> drink2 = new LinkedHashMap<String, Integer>();
public products() {
	// TODO 自動生成されたコンストラクター・スタブ
	products.add("コーラ");
	products.add("スポーツドリンク");
	products.add("天然水");
	products.add("ウーロン茶");

	drink.put(products.get(0),150);
	drink.put(products.get(1),140);
	drink.put(products.get(2),110);
	drink.put(products.get(3),120);
}
}

