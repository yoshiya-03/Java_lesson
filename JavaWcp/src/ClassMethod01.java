public class ClassMethod01 {
    public static void main(String[] args) {
        Human01 yamada = new Human01(); //Human01クラスのインスタンスを生成
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

        Human01 sato = new Human01("佐藤", 25); //Human01クラスのインスタンスを生成
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
    }
}

//アクセス修飾子publicを用いてどこからでもアクセスできるクラスHuman01を定義する
//アクセス修飾子publicを用いてどこからでもアクセスできるメンバー変数nameとageを定義する
//引数なしのコンストラクタを定義する。これを用いて初期化した場合、nameは「山田」、ageは「20」という値で初期化される(それぞれ変数にセットされる)
//引数2つ(String型とint型)のコンストラクタを定義する。これを用いて初期化した場合、nameもageも引数として渡した値で初期化される。初期化対象は生成したインスタンスのメンバー変数なので、thisキーワードを用いて指定する
//実行用ファイル
//引数なしのコンストラクタを用いてHuman01クラスのインスタンスを生成する
//上記インスタンスのnameとageを表示すると、コンストラクタで代入した初期値が表示される
//引数2つのコンストラクタを用いてHuman01クラスのインスタンスを生成する
//上記インスタンスのnameとageを表示すると、コンストラクタの引数に渡した値が表示される
