package j0126_03;

public class Deck {

    Card[] c = new Card[52];   // ⭐ 카드 52장 배열
    String[] shape = {"SPADE", "HEART", "DIAMOND", "CLOVER"};

    Deck() {
        for(int i = 0; i < c.length; i++) {
            c[i] = new Card();
            c[i].number = (i % 13) + 1;   // 1~13 반복
            c[i].kind = shape[i / 13];    // 0~12 SPADE, 13~25 HEART, ...
        }
    }
    // 카드 5장 뽑기 (card5Print)
    void card5Print() {
    	for(int i=0;i<5;i++) {
    		System.out.println(c[i].kind+","+c[i].number);
    	}
    }
    // 카드 섞기 (shuffle)
    void cardshuffle() {
    	for(int i=0;i<c.length;i++) {
    		int r = (int)(Math.random()*c.length);
    		// rc : random card // c.length : 카드 개수(52장)
    	}
    }
    // 랜덤 카드 5장 출력 (card5Print)
    void card5Random() {
    	for(int i=0;i<5;i++) {
    		int r = (int)(Math.random()*c.length);
    		System.out.println("카드 : "+c[r].kind+" ,"+"번호 : "+c[r].number);
    	}
    }
    
//    void card5Random() {
//    	for(int i=0;i<5;i++) {
//    		int r = (int)(Math.random()*c.length);
//    		System.out.println("카드 : "+c[r].kind+" ,"+"번호 : "+c[r].number);
//    		// r : random / i : index 
//    		// c[i].kind i를 쓰게 되면 순차적으로 나옴
//    	}
//    }
   
}
