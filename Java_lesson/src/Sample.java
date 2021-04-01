import java.util.Scanner;

public class Sample{
  public static void main(String[] args){
    // 多重ループ(for文の中にfor文)
    for(int i = 0; i <= 5; i++){
      for(int j = 0; j <= i; j++){ //継続条件がiによって変わる
        System.out.print("○"); //print = 末尾に改行を挿入しない。
      }
      System.out.println(); //println = 末尾に改行を挿入する。今回の場合出力せず改行のみを行うという意味
    }
    /* 出力結果
    ○
    ○○
    ○○○
    ○○○○
    ○○○○○
    ○○○○○○
    */ 

    // ピラミッド
    for(int i = 1; i < 5; i++){ //外側のピラミッド
      for(int j = 0; j < 5 - i; j++){ //f空白部分を4→3→2→1と減らす
        System.out.print(" "); 
      }
      for(int k = 0; k < i * 2 - 1; k++){ //○が1→3→5→7ずつ増加 = 値が奇数なので*2-1をしている 
        System.out.print("○");
      }
      System.out.print("\n"); //改行するための記述
    }
    /* 出力結果
        ○
       ○○○
      ○○○○○
     ○○○○○○○
    ○○○○○○○○○
    */

    // 逆ピラミッド
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < i; j++){
        System.out.print(" ");
      }
      for(int k = 0; k < (5-i) * 2-1; k++){
        System.out.print("○");
      }
      System.out.print("\n");
    }
    /* 出力結果
    ○○○○○○○○○
     ○○○○○○○
      ○○○○○
       ○○○
        ○    
    */

    /*****************************************************************************/
    // 次の日を出す 
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    int month = sc.nextInt();
    int day = sc.nextInt();
    day++;
    int lastDay = getLastDay(year, month); //その月の最終日を調べる
    if(day > lastDay){
       day = 1;
       month++;
    }
    System.out.print(year + " " + month + " " + day);
    }
    public static int getLastDay(int year, int month){
      switch(month){
        case 4:
        case 6:
        case 9:
        case 11:
          return 30;
        case 2:
          return 28;
        default:
          return 31;   
    }
  }  
}