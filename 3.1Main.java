class Main {
  public static void main(String[] args) {
    //Test code for Card class
    testCardConstructor();
    testCardMethods();
    testCardEquivalence();
  }
  
  public static void testCardConstructor() {
    int testRank = 5;
    int testSuit = 2;
    
    Card newCard = new Card(testRank, testSuit);
    if (newCard.rank==5 && newCard.suit==2) {
      System.out.println("Instance variables initialized properly");
    } else {
      System.out.println("Constructor failed to initialize variables properly");
    }
  }

  public static void testCardMethods() {
    Card newCard = new Card(5, 2);

    if (newCard.rankToString().equals("Five") && 
        newCard.suitToString().equals("Clubs")) {
        System.out.println("String conversion works");
    } else {
      System.out.println("String conversion failed");
    }
  }

  public static void testCardEquivalence() {
    Card newCard = new Card(5, 2);
    Card newCard2 = new Card(5, 2);
    if (newCard.equals(newCard2)) {
      System.out.println("Successful equivalence");
    } else {
      System.out.println("Equivalence check failed");
    }
  }
}