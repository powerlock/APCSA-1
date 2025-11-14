public boolean cigarParty(int cigars, boolean isWeekend)
{
  return (cigars >= 40 && cigars <= 60) || (isWeekend && cigars >= 40);
}


public boolean dateFashion(int you, int date)
{
  return (you >= 8 || date >= 8) || (you <=2 || date <= 2);
}


public boolean squirrelPlay(int temp, boolean isSummer)
{
  return (temp >= 60 && temp <= 90) || (isSummer && temp <= 100);
}


public boolean makeBricks(int small, int big, int goal)
{
  return ((goal <= small + big * 5) && (goal % 5 <= small));
}


public int caughtSpeeding(int speed, boolean isBirthday) 
{
  return (speed <= 60) || (!noTicket && speed <= 80) || (!noTicket && !smallTicket);
}
