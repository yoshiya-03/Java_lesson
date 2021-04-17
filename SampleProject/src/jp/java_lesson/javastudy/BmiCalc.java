package jp.java_lesson.javastudy;

public class BmiCalc {
	// BMI (体格指数を計算するプログラム)
	// BMI = 体重 / （身長 * 身長）
	// 体重 kg, 身長 cm
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double weight,height,bmi;
		
		weight = 56;
		height = 178;
		
		height /= 100;
		
		bmi = weight / (height * height);
		
		System.out.println(bmi);
		
		if (bmi < 17) {
			System.out.println("痩せ型です");
		} else if (bmi < 25) {
			System.out.println("標準です");
		} else {
			System.out.println("肥満です");
		}
	}

}
