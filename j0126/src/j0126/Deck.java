package j0126;

public class Deck {

    final int CARD_NUM = 52; // 카드는 총 52장
    Card[] c = new Card[CARD_NUM];
    String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};

    // 기본생성자
    Deck() {
        for(int i=0;i<c.length;i++) {
            c[i] = new Card();
            c[i].number = (i % 13) + 1;     // 1~13 반복
            c[i].kind = shape[i / 13];      // 0~12 SPADE, 13~25 HEART, ...
        }
    }

    // 카드 1장 뽑기 (1~52 입력)
    Card pick(int index) {
        return c[index - 1];
    }

    // 랜덤 1장 뽑기
    Card pick() {
        return c[(int)(Math.random() * CARD_NUM)];
    }

    // 랜덤 5장 뽑기 (중복 없이)
    Card[] pick5() {
        Card[] result = new Card[5];
        boolean[] used = new boolean[CARD_NUM];

        int cnt = 0;
        while(cnt < 5) {
            int r = (int)(Math.random() * CARD_NUM);
            if(!used[r]) {
                used[r] = true;
                result[cnt] = c[r];
                cnt++;
            }
        }
        return result;
    }

    // 카드 섞기
    void shuffle() {
        for(int i=0;i<500;i++) {
            int random = (int)(Math.random() * CARD_NUM); // 0~51
            Card temp = c[0];
            c[0] = c[random];
            c[random] = temp;
        }
        System.out.println("카드섞기가 완료되었습니다.");
    }
}
