/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cardgame;


import java.util.Random;
import java.util.Scanner;

/**
 *  
 * @author Arish Verma
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Card[] hand=new Card[7];
        Scanner sc=new Scanner(System.in);
        hand=CardHandGenerator.generateHand();
        for(Card c:hand)
        {
            System.out.println(c.getValue()+" of "+c.getSuit());
        }
        System.out.println("Pick a card to compare:");
        System.out.println("Pick a suit:");
        for(int i=0;i<Suit.values().length;i++)
        {
            System.out.println((i+1)+": "+ Suit.values()[i]);
        }
        
        
        
        System.out.println("Pick a suit for the card: ");
        int suit=sc.nextInt();
        
        
        for(int i=0;i<Value.values().length;i++)
        {
            System.out.println((i+1)+": "+ Value.values()[i]);
        }
        System.out.println("Pick a value for the card: ");
        int valuePos=sc.nextInt()-1;
        Card pickCard=new Card(Value.values()[valuePos],Suit.values()[suit-1]);
        System.out.println("you have chosen "+pickCard.getValue()+ " of "+pickCard.getSuit());
        
        boolean match=CardCompare.compareCard(hand, pickCard);
         if(match)
                System.out.println("match found");
            else
                System.out.println("no match found");
    }
    
        
        
}
