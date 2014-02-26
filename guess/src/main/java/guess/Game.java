package guess;

/**
 * Created by peiyuchen on 2/26/14.
 */
public class Game {

    private int count = 0;

    public Game(String s) {
    }
    public Game(String s,IRandomProvider randomProvider) {
    }


    public String guess(String s) {
        count++;
        if(count == 6) {
            return "you lose!";
        }
        return "wrong";
    }

    public boolean validateRandomNum(String random) {
        return true;
    }

    public String tip(String s) {
        return null;
    }
}
