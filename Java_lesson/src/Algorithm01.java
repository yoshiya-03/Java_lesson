
public class Algorithm01 {
	public static void main(String[] args) {
		// FizzBuzzを改良する
		// 1から整数を数える
		// 3で割り切れる = Fizz
		// 5で割り切れる = Buzz
		// 3でも5でも割り切れる = FizzBuzz

		for (int i = 1; i <= 30; i++) {
			String output;
			output = "";
			//ループの中で空文字を代入
			if (i % 3 == 0) {
				output = "Fizz";
				//条件が成立したらi変数にFizzを代入
			}
			if (i % 5 == 0) {
			// else ifではなくif文を使うことで3で割り切れる場合でも条件判定がスキップされない
				output = output + "Buzz";
			}
			output = String.valueOf(i) + ":" + output;
			//output変数にFizzとBuzzを代入
			System.out.println(output);
		}
	}
}
