
public class For01 {
    public static void main(String[] args) {
        // for文：
        // 初期化式：numberを1で初期化
        // 条件式：numberが5未満の場合、ブロックの処理を行う
        // 変化式：ブロックの処理後に、numberをインクリメント
        for (int number = 1; number <= 5; number++) {
            // ブロック：numberを出力
            System.out.println("For01 = " + number);
        }
    }
}

// for文
// for (初期化式; 条件式; 変化式) {
//ブロック（繰り返し処理）
//}