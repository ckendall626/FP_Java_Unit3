/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

public class Card {
 public final int rank;
public final int suit;

    // Kinds of ranks
    public final static int ACE   = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR  = 4;
    public final static int FIVE  = 5;
    public final static int SIX   = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE  = 9;
    public final static int TEN   = 10;
    public final static int JACK  = 11;
    public final static int QUEEN = 12;
    public final static int KING  = 13;

  public final static int DIAMONDS = 1;
  public final static int CLUBS = 2;
  public final static int HEARTS = 3;
  public final static int SPADES = 4;

  public Card (int startRank, int startSuit) {
    if (startSuit >= 1 && startSuit <= 4){
      suit = startSuit;
    }
    else {
      throw new RuntimeException();
    }
    if (startRank >= 1 && startRank <= 13){
      rank = startRank;
    }
    else {
      throw new RuntimeException();
    }
  }
    // Here you need to define the int values of the suits. They are
    // DIAMONDS, CLUBS, HEARTS, SPADES (in order of value, starting at 1)
    /*
     * declaring the suit constants
     *
     */

    // Here you need to define the constructor. It takes an int for the 
    // starting rank and an int for the starting suit
    /*
     * declaring the constructor
     *
     */

    // Here is the if-then-else approach for returning the string
    // as a rank
    public String rankToString() {
        if (rank == ACE) {
            return "Ace";
        } else if (rank == DEUCE) {
            return "Deuce";
        } else if (rank == THREE) {
            return "Three";
        } else if (rank == FOUR) {
            return "Four";
        } else if (rank == FIVE) {
            return "Five";
        } else if (rank == SIX) {
            return "Six";
        } else if (rank == SEVEN) {
            return "Seven";
        } else if (rank == EIGHT) {
            return "Eight";
        } else if (rank == NINE) {
            return "Nine";
        } else if (rank == TEN) {
            return "Ten";
        } else if (rank == JACK) {
            return "Jack";
        } else if (rank == QUEEN) {
            return "Queen";
        } else if (rank == KING) {
            return "King";
        } else {
            //Handle an illegal argument.  There are generally two
            //ways to handle invalid arguments, throwing an exception
            //(see the section on Handling Exceptions) or return null
            return null;
        }    
    }
  public String suitToString() {
    if (suit == DIAMONDS) {
      return "Diamonds";
  }
    if (suit == CLUBS) {
        return "Clubs";
    }
    if (suit == HEARTS) {
        return "Hearts";
    }
    if (suit == SPADES) {
        return "Spases";
    }
    else {
      return null;
    }
  }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Card))
            return false;
        Card rhs = (Card) obj;
        return (suit == rhs.suit &&
                rank == rhs.rank);
    }

    @Override
    public int hashCode() {
        int result = 0;
        return 31 * suit + rank;
    }

    
    
}
