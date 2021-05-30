package classMethod;

import java.util.ArrayList;
import java.util.List;

public class ClassMethod03 {
	
	public static final String[][] GAME_START_MSG = {
			{"1","2","3"},
			{"4","5","6"},
			{"7","8","9"}
};
    public static void main(String[] args) {
    	
        hoge(GAME_START_MSG);
    }
    
    public static void hoge(String CardTrump[][]) {
    	//String[] cardTrump = CardConst.CARD_TRUMP[0];
        List<String> deck = new ArrayList<>();
        for(int i = 0; i<GAME_START_MSG.length;i++){
        	for(int j =0; j<GAME_START_MSG[2].length;j++) {
        		String str = GAME_START_MSG[0][i];
        		String str2 = GAME_START_MSG[1][i];
        		String str3 = GAME_START_MSG[2][i];
        		System.out.println(str);
        		System.out.println(str2);
        		System.out.println(str3);
        		System.out.println();
        		deck.add(str);
        	
        	}
            
        }
   
        
        

    }
}