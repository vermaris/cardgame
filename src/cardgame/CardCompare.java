/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cardgame;

/**
 *
 * @author Arish Verma
 */
public class CardCompare {
    public static boolean compareCard(Card[] hand,Card pickCard)
    {
        boolean match=false;
        for(Card c:hand)
        {
            if(c.getSuit()==pickCard.getSuit() && c.getValue()==pickCard.getValue())
            {
                match=true;
                break;
            }
           
        }
        return match;
    }

}
