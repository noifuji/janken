package janken;

import java.util.Random;

public class Player {
    private Hand hand;

    public void setRandomHand() {
        Random random = new Random();
        int randomValue = random.nextInt(2);
        
        if(randomValue == 0) {
            this.hand = new Gu();
        } else if(randomValue == 1) {
            this.hand = new Choki();
        } else if(randomValue == 2) {
            this.hand = new Pa();
        }
    }
    
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    
    public Hand getHand() {
        return this.hand;
    }
}