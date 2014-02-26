package guess;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by peiyuchen on 2/26/14.
 */
public class GameTipsTest {
    @Test
    public void test_give_wrong_tips(){
        // given
        String num = "2316";

        // when
        Game game = new Game(num);
        String output = null;
        for(int i=1;i<=6;i++) {
            output = game.guess("1234");
        }

        //then
        assertEquals("you lose!", output);
    }

    public void test_guess_all_right() {
        Game game = new Game("2316");
        String output = game.tip("2316");

        assertEquals("x4y0", output);
    }
    public void test_randomnum_is_validate(){

        boolean output;
        IRandomProvider randomProvider=mock(IRandomProvider.class);
        when(randomProvider.getRandom()).thenReturn("1234");

        output=new Game("1234",randomProvider).validateRandomNum(randomProvider.getRandom());
        assertEquals(true,output);
    }
}
