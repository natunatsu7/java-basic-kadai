package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
	/*	randomメソッドを使用する場合 (80歳までの設定) 
		int userAge = (int)(Math.random() * 81);
	*/	
		
		int userAge = 30; //年代
		int serviceCost = 0; //使用料金
		
		serviceCost = switch (userAge) {
		case 10 -> 1000;
		case 20 -> 2000;
		case 30 -> 3000;
		case 40 -> 3000;
		case 50 -> 4000;
		case 60 -> 4000;
		case 70 -> 4000;
		case 80 -> 5000;
		default -> 500;
		};
		
		System.out.println("30代の料金は" + serviceCost + "円");

	}

}
