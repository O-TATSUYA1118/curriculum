package jihanki;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Method{

	//スキャナーの設定
	public static Scanner sc = new Scanner(System.in);

	//商品のインスタンス
	public static Product pro = new Product();

	//入力内容取得用変数
	public static String drink = null;

	//飲み物の名前を入力させたあと購入判定
	public static void loop(int money) {
		while(true) {
			System.out.println(Constants.CHOICE_DRINK);
			System.out.println(Constants.DRINK_NAME);
			//購入する飲み物の名前を入力させる
			drink = sc.next();
			//containsKeyを使用してdrink3にユーザが入力した飲み物があるか判定を行う
			if(pro.drink3.containsKey(drink)) {
				//trueだった場合(drink3に存在した場合)に飲み物の名前を表示
				System.out.println(drink+"を買いました");
				//飲み物の値段よりユーザが入力した金額の方が大きければお釣りを計算する
				if(money > pro.drink3.get(drink)) {
					//drink3から購入した飲み物の値段を取得しユーザが入力した値段から減算を行い再代入する
					money -= pro.drink3.get(drink);
					System.out.println("お釣りは"+money+"円です");
					//ユーザの入力と飲み物の値段が等しい時の表示
				}else {
					System.out.println("お釣りはありません");
				}
			//falseだった場合(drink3に存在しなかった場合)
			}else {
				System.out.println("お金が足りないか、存在しない商品です");
				break;
			}
				//オマケ  数字が揃ったらもう一本買える処理
				Random rand = new Random();
				int one, two, three ;
				one = rand.nextInt(9)+1;
				two = rand.nextInt(9)+1;
				three = rand.nextInt(9)+1;
				System.out.println("数字が揃ったらもう一本！");
				if(one == two && two == three) {
					System.out.println(one + "" + two + "" + three + ": 当たり！もう一本!");
					continue;
				}else {
					System.out.println(one + "" +two+ "" + three + ": ざんねん！また買ってね！");
					break;
				}
			}
		}

	//drink2からdrink3に購入できる飲み物を移動させる
	public static void drink_method(int money) {
		//インクリメント用変数
		int b = 0;
		System.out.println(money+"円で買える飲み物です！");
		//拡張for文を使用して購入できる飲み物の名前と値段をdrink3にセットしていく
		for (Map.Entry<String, Integer> nKey : pro.drink2.entrySet()){
			//飲み物の値段がユーザの入力以下の場合に行う処理(drink2から参照)
			if(money >= nKey.getValue()) {
			//drink3に飲み物の名前と値段を追加する
				pro.drink3.put(pro.drink.get(b), nKey.getValue());
			//購入できる飲み物をループを使用して全て表示させる
				System.out.println(nKey.getKey()+" :"+nKey.getValue()+"円");
			}
			//インクリメント
			 b++;
    	}
	}

	//最初に実行されるメソッド
	//ユーザが入力した値を引数に持つ
	public static void drink_main() {
		//条件を満たすまでループ処理
		while(true) {
			//Scannerを使用して数字の入力を待つ
			int money = sc.nextInt();
			//入力が1000より大きい場合の処理
			if(money > 1000){
				System.out.println(Constants.OVER_MONEY);
			//continueを使用して再度入力させる
				continue;
			//入力が110より小さい場合の処理
			}else if(money < 110){
				System.out.println(Constants.LITTLE_MONEY);
				continue;
			//1000以下110以上の場合の処理
			}else if(money <= 1000 && money >= 110){
				drink_method(money);
	        }
				loop(money);
				break;
			}
			sc.close();
		}
	}
