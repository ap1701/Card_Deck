import java.util.*;
import java.io.*;
public class Deck {

    Vector<Card> createDeck()
    {

        Vector<Card> cardDeck = new Vector<Card>(); // This is to return a single vector of 4 vectors

        String[] cards = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};


        for(String card:cards)
        {
            Card heartCard = new Card("♥️",card);
            cardDeck.add(heartCard);
            Card clubCard = new Card("♣️",card);
            cardDeck.add(clubCard);
            Card diamondCard = new Card("♦️",card);
            cardDeck.add(diamondCard);
            Card spadeCard = new Card("♠️",card);
            cardDeck.add(spadeCard);

        }
        System.out.println();
        System.out.println("✅✅Deck Created Successfully");
        System.out.println("📃📃Summary");
        System.out.println("In a deck you have 4 Suits which are \n1️⃣♠️(Spade)(A-K)\n2️⃣♣️(Club)(A-K) \n3️⃣♥️(Heart)(A-K)\n4️⃣♦️(Diamond)(A-K)");
        return cardDeck;
    }
}
