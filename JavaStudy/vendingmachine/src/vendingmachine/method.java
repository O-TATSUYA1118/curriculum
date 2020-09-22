package vendingmachine;

import java.util.Map.Entry;

public class method{
	public static products drinkSet = new products();

	public static void purchase(int money){
		while(true) {
			if(money > 1000) {
				System.out.println(message.OVER_MONEY);
		}
			else if(money < 110) {
				System.out.println(message.LOW_MONEY);
			}
			else {
				System.out.println("投入した金額は"+money+"円です、以下の商品が購入出来ます。");

				for (Entry<String, Integer> entry : drinkSet.drink.entrySet()) {
					if(money >= entry.getValue()) {
						drink2 = entry.getValue();
					}
				}
			}

		}
	}
}
