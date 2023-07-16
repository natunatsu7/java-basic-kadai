package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {

		// 変数名は何が正しいかわからないが数字の英語にしました。
		boolean[] number = new boolean[100];
		// 2から１ずつ増えていき100まで増えていく繰り返し処理。
		for (int i = 2; i < number.length; i++) {
			// booleanなのでtrueかfalseの記述。intだとエラーになる。
			//iを配列の変数で使用 素数の場合trueを返してくれる。
			number[i] = true;
		}

		
		/*素数ではない数字をはじかないといけないため、falseを記述。
		 *変数iとjの初期値は2なので2×2＝4、2×3=6で素数以外の数字をfalseにする。
		 *2の段が終わったら3の段に進む。
		 */
		//2から1ずつ増えていき100まで増えていく繰り返し処理。
		for (int i = 2; i < 100; i++) {
			//if文で配列変数iが条件式
			if (number[i]) {
				for (int j = 2; i * j < 100; j++) {
					number[i * j] = false;
				}
			}
		}
		
		//出力のためのソース。
			for (int i = 2; i < 100; i++) {
				if (number[i]) {
				System.out.println(i);
			}
		}

	}
}

