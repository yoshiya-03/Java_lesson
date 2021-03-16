
public class DoWhile01 {
	public static void main(String[] args) {

		int number = 1;
		//		do-while文：ループ開始
		do {
			//			ブロック
			//			numberにnumber * 2を代入、numberを出力
			number *= 2;
			System.out.println("DoWhile01 = " + number);
			//			do-while文
			//			numberが50未満の場合、ブロックのループ処理を行う
		} while (number < 50);
	}
}
