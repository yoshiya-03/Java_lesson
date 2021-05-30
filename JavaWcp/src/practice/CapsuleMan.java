package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import common.CardConst;
import util.TrumpApplication;

/**
  
/**
  * ババ抜きゲームです。
  *
  * @author ITEC
  */
public class Babanuki extends TrumpApplication implements GameInterface {

	@Override
	public void execute() {
		// 開始メッセージ

		System.out.println(startMsg("start"));
		System.out.println("実行したい処理の番号を選んでください\n" +
				"1:ババ抜きを始める\n" + "2:成績を参照する\n" + "3:処理を終了する");
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String line;
				line = reader.readLine();
				int val = Integer.parseInt(line);

				switch (val) {
				case 1:
					game();
					break;
				case 2:
					//resultReference();
					getGameResults("");
					break;
				case 3:
					end();
					break;
				}
			}
		} catch (IOException e) {
			// 本課題では例外時の処理を考慮しない
		}
	}

	@Override
	public void game() {
		List<String> player = new ArrayList<>();
		List<String> computer = new ArrayList<>();
		gameStart();
		deckShuffle();
		// handsCard();
		// exclusion();
		//usersTurn(player, computer);
	}

	// 1の処理
	public void gameStart() {
		try {

			System.out.println(CardConst.GAME_START_MSG);

			System.out.println("これよりトランプゲーム【ババ抜き】を開始します");
			Thread.sleep(1000);
			System.out.println("カード配布中"); // ...を出力させる

		} catch (InterruptedException e) {
			// TODO: handle exception
		}

	}

	// 1 配列の中身を並べ替え(シャッフル)
	public void deckShuffle() {

		List<String> deck = new ArrayList<>(52);
		deck.add(CardConst.CARD_TRUMP_JOKER);
		for (int i = 0; i < CardConst.CARD_TRUMP[0].length; i++) {

			String deck1 = CardConst.CARD_TRUMP[0][i];
			// System.out.println(deck1); デバッグ用
			deck.add(deck1);
		}

		for (int i = 0; i < CardConst.CARD_TRUMP[1].length; i++) {
			for (int j = 0; j < 1; j++) {
				String deck2 = CardConst.CARD_TRUMP[1][i];
				// System.out.println(deck2); デバッグ用
				deck.add(deck2);
			}
		}

		for (int i = 0; i < CardConst.CARD_TRUMP[2].length; i++) {
			for (int j = 0; j < 1; j++) {
				String deck3 = CardConst.CARD_TRUMP[2][i];
				deck.add(deck3);
			}
		}
		for (int i = 0; i < CardConst.CARD_TRUMP[3].length; i++) {
			for (int j = 0; j < 1; j++) {
				String deck4 = CardConst.CARD_TRUMP[3][i];
				deck.add(deck4);
			}
		}
		Collections.shuffle(deck);
		// System.out.println(deck);デバッグ用
		handsCard(deck);

	}

	// 2 手札を表示するメソッド（ランダムのカード）
	public void handsCard(List<String> deckList) {
		// それぞれの手札を生成

		List<String> player = new ArrayList<>();
		for (int i = 0; i < CardConst.CARD_NUM_HALF - 1; i++) {
			player.add(deckList.get(i));
			deckList.remove(i);
		}
		System.out.println(CardConst.MSG_USER_CARD);
		System.out.println(player);

		List<String> computer = new ArrayList<>();
		for (int i = 0; i < CardConst.CARD_NUM_HALF - 1; i++) {
			computer.add(deckList.get(i));

		}
		exclusion(player, computer);
	}

	// 3 重複したカードを除外するメソッド
	public void exclusion(List<String> player, List<String> computer) {

		try {
			System.out.print("カード精査中");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			System.out.println("完了");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		for (int i = 0; i < player.size(); i++) {

			String str = player.get(i).substring(1);

			Iterator<String> it = player.iterator();
			while (it.hasNext()) {
				String x = it.next();
				if (x.contains(str)) {
					it.remove();
				}

			}

			//listがどんな状態か表示してみる。
			//for (int j = 0; j < player.size(); j++) {
			//System.out.println("pl"+player);

			//}
		}

		//		for (int i = 0; i < player.size();i++) {
		//			for (int j = 0; j < player.size();) {
		//				String str = player.get(i).substring(1);
		//				//int index = player.get(j).indexOf(str);
		//				player.get(j).contains(str);
		//
		//				if (player.indexOf(str) != -1) {
		//					System.out.println(str+"見つかりました");
		//					player.remove(player.indexOf(player.get(j)));
		//					
		//				} else {
		//					j++;
		//					System.out.println(str+"は見つかりません");
		//				}
		//				//System.out.println("");
		//				//System.out.println(str);
		//				//if (index != -1   ) {
		//			}
		//		}
		//computerのカード
		for (int i = 0; i < computer.size(); i++) {

			String str = computer.get(i).substring(1);

			Iterator<String> it = computer.iterator();
			while (it.hasNext()) {
				String x = it.next();
				if (x.contains(str)) {
					it.remove();
				}
			}
			//		for (int i = 0; i < computer.size(); i++) {
			//			for (int j = 0; j < i;) {
			//				String str = computer.get(i).substring(1);
			//				int index = computer.get(j).indexOf(str, 1);
			//				computer.get(j).contains(str);
			//
			//				if (index != -1) {
			//					computer.remove(computer.get(j).lastIndexOf(str));
			//				} else {
			//					j++;
			//				}
			//				
			//			}
			//		}

		}
		System.out.print(CardConst.MSG_USER_CARD + player);
		System.out.println("");
		System.out.println("com" + computer);

		usersTurn(player, computer);
	}

	// 4 ユーザーがカードを引くメソッド
	public void usersTurn(List<String> player, List<String> computer) {
		System.out.println("");
		System.out.println("");
		System.out.println(player);
		//clearCards(player);
		if (player.size() == 0) {
			System.out.println(CardConst.WIN_MSG);
		} else {
			System.out.println(CardConst.TURN_MSG_USER);
			System.out.println("COM側のカード番号を選択してください");

			displayCards(computer);
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// キーボードから文字が入力された場合、その文字列をlineに格納する
			try {
				String line;
				line = reader.readLine();
				int i = Integer.parseInt(line);

				//while (continue_game) {

				//if (player1) {

				String choose = computer.get(i);

				computer.remove(i);
				player.add(choose);

				//					int rnd = (int) (Math.random() * computer.size());
				//
				//					System.out.println(computer.get(rnd));
				//
				//					player.add(computer).get(rnd);
				//					computer.remove(i);
				clearCards(player);
				System.out.println(player);
				comTrun(player, computer);
				//displayCardsReverse((player));
				//displayCards(computer);

				//player1 = true;

				//}
				//}
			} catch (IOException e) {
				System.out.println("カードは" + computer.size() + "から選択してください");
				e.printStackTrace();
			}

			//       
		}
	}

	// 5 comのターン
	public void comTrun(List<String> player, List<String> computer) {
		System.out.println(CardConst.TURN_MSG_COM);
		try {
			System.out.print("カード選択中");// ...完了を入れる
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			System.out.println("完了");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		if (player.size() == 0) {
			System.out.println(CardConst.WIN_MSG);
			//continue_game = false;
		} else {
			int i = (int) (Math.random() * player.size());

			player.get(i);

			computer.add(player.get(i));
			player.remove(i);

			clearCards(computer);
			usersTurn(player, computer);
		}
	}

	//  6 相手のカードを出力するメソッド
	private void displayCards(List<String> comlist) {
		// comのカードを出力
		List<String> card = comlist;
		//clearCards(comlist);
		if (comlist.size() == 0) {
			// comのカードが0枚ならcomの勝ち
			System.out.println(CardConst.LOSE_MSG);
			//continue_game = false;
		} else {
			for (int x = 0; x < card.size(); x++) {
				for (int i = 0; i < 9; i++) {
					for (int j = 0; j < 5; j++) {
						if (i == 0 && j == 0) {
							System.out.print("+");
						} else if (i == 0 && j == 1) {
							System.out.print("-");
						} else if (i == 0 && j == 2) {
							System.out.print("-");
						} else if (i == 0 && j == 3) {
							System.out.print("-");
						} else if (i == 0 && j == 4) {
							System.out.print("+");
						} else if (i == 1) {
							System.out.print(" ");
						} else if (i == 2 && j == 0) {
							System.out.print("|");
						} else if (i == 2 && j == 4) {
							System.out.print("|");
						} else if (i == 3) {
							System.out.print(" ");
						} else if (i == 4 && j == 0) {
							System.out.print("|");
						} else if (i == 4 && j == 2) {
							System.out.print(x);
						} else if (i == 4 && j == 4) {
							System.out.print("|");
						} else if (i == 5) {
							System.out.print(" ");
						} else if (i == 6 && j == 0) {
							System.out.print("|");
						} else if (i == 6 && j == 4) {
							System.out.print("|");
						} else if (i == 7) {
							System.out.print("");
						} else if (i == 8 && j == 0) {
							System.out.print("+");
						} else if (i == 8 && j == 1) {
							System.out.print("-");
						} else if (i == 8 && j == 2) {
							System.out.print("-");
						} else if (i == 8 && j == 3) {
							System.out.print("-");
						} else if (i == 8 && j == 4) {
							System.out.print("+");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}

		}
	}

	public List<String> clearCards(List<String> list) {
		for (int i = 0; i < list.size(); i++) {

			String str = list.get(i).substring(1);

			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				String i2 = it.next();
				if (i2.contains(str)) {
					it.remove();
				}
			}
		}
		return list;
	}

	// 2の処理
	public void resultReference() throws IOException {
		try {
			File file = new File("file//result.txt");
			FileReader filereader = new FileReader(file);
			int ch;
			while ((ch = filereader.read()) != -1) {
				System.out.print((char) ch);
			}
			filereader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 3の処理
	public void end() {
		System.out.println(CardConst.MSG_EXIT_AP);
	}

}
