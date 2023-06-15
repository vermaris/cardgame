/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cardgame;

/**
 *
 * @author Arish Verma
 */
public class Card {

    private Value value;
        private Suit suit;
        
        

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
        
        

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
	
        
}
