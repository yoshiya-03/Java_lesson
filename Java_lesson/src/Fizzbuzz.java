
public class Fizzbuzz {
	public static void main(String[] args) {
		//		「1から100までの数字を画面に表示する」
		//		「3の倍数のときは数字の代わりにFizzと表示する」
		//		「5の倍数のときは数字の代わりにBuzzと表示する」
		//		「15の倍数のときは数字の代わりにFizzBuzzと表示する」
		for (int number = 1; number <= 100; number++) {
			//　for文で1~100までループ
			if (number % 3 == 0 && number % 5 == 0) {
				// 3の倍数且つ、5の倍数の場合
				System.out.println("FizzBuzz");
			} else if (number % 3 == 0) {
				System.out.println("Fizz");
			} else if (number % 5 == 0) {
				System.out.println("Buzz");
			} else {
				//	いずれでもない場合
				System.out.println(number);
			}
		}
	}
}
