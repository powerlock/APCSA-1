package performanceTaskThing;

public class Cigar {
	public boolean cigarParty(int cigars, boolean weekend) {
	    if (weekend) {
	        return cigars >= 40;
	    } else {
	        return cigars >= 40 && cigars <= 60;
	    }
	}

	public int dateFashion(int you, int date) {
	    if (you <= 2 || date <= 2) {
	        return 0;
	    } else if (you >= 8 || date >= 8) {
	        return 2;
	    } else {
	        return 1;
	    }
	}
	public boolean squirrelPlay(int temp, boolean summer) {
	    int max = 90;
	    if (summer) {
	        max = 100;
	    }
	    return temp >= 60 && temp <= max;
	}
	public int caughtSpeeding(int speed, boolean birthday) {
	    if (birthday) {
	        speed = speed - 5;
	    }

	    if (speed <= 60) {
	        return 0;
	    } else if (speed <= 80) {
	        return 1;
	    } else {
	        return 2;
	    }
	}
	public boolean makeBricks(int small, int big, int goal) {
	    int bigUsed = goal / 5;
	    if (bigUsed > big) {
	        bigUsed = big;
	    }
	    int left = goal - bigUsed * 5;
	    return left <= small;
	}


}

//string practice

public class MyProgram {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(withoutEnd("Hello"));
        System.out.println(hasBad("xbadxx"));
    }

    public static String makeOutWord(String out, String word) {
        String first = out.substring(0, 2);
        String last = out.substring(2);
        return first + word + last;
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static boolean hasBad(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }
}
