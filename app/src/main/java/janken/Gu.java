package janken;

public class Gu implements Hand {
    private static final String HAND_NAME = "グー";

    public int compare(Hand hand) {
        //エラー処理追加
        
        if(hand instanceof Choki) {
            return 1;
        } else if(hand instanceof Pa) {
            return -1;
        }
        
        return 0;
    }
    
    public String getHandName() {
        return HAND_NAME;
    }
}