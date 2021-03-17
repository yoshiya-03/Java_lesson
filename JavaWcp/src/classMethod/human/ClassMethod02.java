// パッケージ宣言
package classMethod;

public class ClassMethod02 {
    public static void main(String[] args) {
        Human2 yamada = new Human2();  //Human02クラスのインスタンスを生成
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

        Human2 sato = new Human2("佐藤", 25); //Human02クラスのインスタンスを生成
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
    }
}