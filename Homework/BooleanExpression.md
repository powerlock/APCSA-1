# Write the boolean expression and finish the method for the following questions.

1. public boolean cigarParty(int cigars, boolean isWeekend)
   
  When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
  Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.

public class squirrels {
    public static void main(String[] args) {
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars>=40;
        } else {
            return cigars>=40&&cigars<=60;
        }
    }
}


2. public int dateFashion(int you, int date)
   You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes).
   With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).

   public int dateFashion(int you, int date) {
    if (you<=2||date<=2) {
        return 0;
    }
    else if (you>=8 || date>=8) {
        return 2;
    }
    else {
        return 1;
    }
}


4. public boolean squirrelPlay(int temp, boolean isSummer)
   The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive).
   Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

public boolean squirrelPlay(int temp, boolean isSummer) {
    if (isSummer) {
        return temp>=60&&temp<=100;
    } else {
        return temp>=60&&temp<=90;
    }
}

   

6. public int caughtSpeeding(int speed, boolean isBirthday)
   You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
   If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

public int caughtSpeeding(int speed, boolean isBirthday) {
    if (isBirthday) {
        speed-=5;
    }
    if (speed<=60) {
        return 0;
    } else if (speed<=80) {
        return 1;
    } else {
        return 2;
    }
}


7. public boolean makeBricks(int small, int big, int goal)
   We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
   Return true if it is possible to make the goal by choosing from the given bricks.

   makeBricks(3, 1, 8) → true
   makeBricks(3, 1, 9) → false
   makeBricks(3, 2, 10) → true

public boolean makeBricks(int small, int big, int goal) {
    int maxBig=goal / 5;
    int bigUsed=Math.min(big, maxBig);
    int remaining=goal-(bigUsed*5);
    return remaining<=small;
}


