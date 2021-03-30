
public class Switch {
	public static void main(String[] args) {
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました!");
			break;
		case 2:
			System.out.println("ふつうでした!");
			break;
		default:
			System.out.println("がんばろう!");
		}
	}
}
//if文で書くことも可能
//public class Switch02 {
//    public static void main(String[] args) {
//        int val = 2;
//        if (val == 3) {
//            System.out.println("よくできました！");
//        } else if (val == 2) {
//            System.out.println("ふつうでした！");
//        } else {
//            System.out.println("がんばろう！");
//        }
//    }
//}
