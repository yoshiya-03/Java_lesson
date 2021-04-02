
public class Fizzbuzz02 {
 public static void main(String[] args) {
//	 条件演算子を用いてコードを短く
	 for(int number = 1; number <= 100; ++number) {
		 System.out.println(((number % 3 == 0 && number % 5 == 0) ? "FizzBuzz" : ((number % 5 == 0) ? "Buzz" : ((number % 3 == 0) ? "Fizz" : number + ""))));
	 }
  }
}
