
public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			System.out.println("While = " + number * number);
			number++;
			//			変数「num」を「while」文のブロック内でインクリメントしながら、「while」文の条件「num < 5」までループ処理を行う。
		}
		int array[] = { 1, 14, 35, 68 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			//			配列の変数「array」を初期化。
			//			変数「i」を0で初期化してインクリメントしながら、変数「array」のサイズ分（array.length）、ループ処理を行う。
		}
		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
			//			変数「array」の要素分ループ処理を行い、取得した要素「val」が偶数の場合は、「continue」で処理をスキップして、奇数の場合のみ出力。
			//			今回のように奇数の場合の処理が少ない場合は、if文を使用しても大きな違いはないが、処理が多くなると「continue」を使用した方がプログラムが分かりやすくなる。
		}
	}
}