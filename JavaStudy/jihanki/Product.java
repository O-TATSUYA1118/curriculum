package jihanki;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Product {
	//飲み物の名前を格納するリスト
	public final List<String> drink = new ArrayList<String>();
	//飲み物の名前と値段を格納するマップ
	public final Map<String, Integer> drink2 = new LinkedHashMap<String, Integer>();
	//ユーザが入力した値段に対して購入できる飲み物を参照し格納するマップ
	public final Map<String, Integer> drink3 = new LinkedHashMap<String, Integer>();

	//コンストラクタに値を定義し、インスタンス化した際に格納する。
	public Product() {

		//リストに名前をいれる
		drink.add("コーラ");
		drink.add("スポーツドリンク");
		drink.add("コーヒー");
		drink.add("天然水");
		drink.add("ウーロン茶");

		//リストから名前を取得しキーにセット。バリューに値段をセットする。
		drink2.put(drink.get(0), 150);
		drink2.put(drink.get(1), 140);
		drink2.put(drink.get(2), 120);
		drink2.put(drink.get(3), 110);
		drink2.put(drink.get(4), 130);

	}
}
