package jp.java_lesson.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello " + this.name);
		//this→ メソッドを定義しているクラスの中のnameというフィールドを参照する
	}
}

public class StaffInfo {
//クラス定義
	public static void main(String[] args) {  //メソッド定義
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff();
		yamada.name = "Taro Yamada";
		
		yamada.sayhello();
		//System.out.println(yamada.name);
	}

}

//public ←アクセス修飾子

