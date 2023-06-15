/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cardgame;

import java.util.Random;

/**
 *
 * @author Arish Verma
 */
public class CardHandGenerator {
    public static Card[] generateHand()
    {
        Card[] hand=new Card[7];
        
        Random random=new Random();
        for(int i=0;i<hand.length;i++)
        {
            Value value=Value.values()[random.nextInt(13)];
            Suit suit=Suit.values()[random.nextInt(4)];
            Card c=new Card(value,suit);
            hand[i]=c;
        }
        return hand;
    }

}
