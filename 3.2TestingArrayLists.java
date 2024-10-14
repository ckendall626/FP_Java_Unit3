import java.util.ArrayList;
class TestingArrayLists {
  public static void testLists() {
    ArrayList<String> nameList = new ArrayList<String>();
    nameList.add("Hanni");
    nameList.add ("Minji");
    nameList.add ("Haerin");
    nameList.add ("Hyein");
    String bias = "Danielle";
    nameList.add(2, bias);
    System.out.println (nameList.get(2));
    System.out.println (nameList.get(0));
    //nameList.remove(nameList.size() -1);
    for (int i = 0; i < nameList.size(); i++){
      System.out.println (nameList.get(i));
    }
    System.out.println (nameList.contains("Danielle"));
    System.out.println (nameList.indexOf("Haerin"));
    System.out.println (nameList.indexOf("Wonyoung"));
    System.out.println (nameList.size());

    ArrayList<Boolean> booList = new ArrayList<Boolean>();
    booList.add(true);
    booList.add(false);
    booList.add(true);
    booList.add(true);
    booList.add(false);
    System.out.println(booList.size());
    booList.set (1, true);
    booList.set(4, true);
    
    
    
    for (int h = 0; h < booList.size(); h++){
      System.out.println(booList.get(h));
    }
    
    
}
  public static void testObjectLists() {
    ArrayList <Card> cardList = new ArrayList<Card>(5);
    for (int c = 0; c < 5; c++){
      // first one is rank 1-13 and other is suit 1-4
      cardList.add(c, new Card((int) (Math.random() * 13 + 1), (int) (Math.random() * 4 + 1)));
      System.out.println(cardList.get(c).rankToString() + " " + cardList.get(c).suitToString()); 
    }
    
  }
  public static void removeOdds (ArrayList exlist, int examplelimit){
    for (int o = 1; o < examplelimit; o += 2){
      System.out.println(o);  
      exlist.remove(o);
      }
    }
static ArrayList<Card> deck = new ArrayList<Card>(52);
  public static void testDeck() {
    for (int r = 1; r < 14; r++ ){
      for (int s = 1; s < 5; s++){
        deck.add(new Card(r, s));
      }
    }
    java.util.Collections.shuffle(deck);
    final int limit = deck.size();
    /*for (int nwjns = 0; nwjns < limit; nwjns++ ){
      deck.remove(nwjns);
    }*/
    removeOdds(deck, limit);
  System.out.println(deck.size());
    for (int ive = 0; ive < deck.size(); ive++){
     if (deck.get(ive).suit == 4 && deck.get(ive).rank == 1){
       System.out.println("Ace of Spades in the deck");
     }
    }
  }
}