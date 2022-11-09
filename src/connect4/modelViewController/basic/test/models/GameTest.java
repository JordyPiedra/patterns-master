package connect4.modelViewController.basic.test.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import connect4.modelViewController.basic.models.Game;

public class GameTest {

    Game outGame;
    List<Integer> plays;

    @BeforeEach
    void init() {
        this.outGame = new Game();
        this.plays = new ArrayList<Integer>();
    }

    @Test
    void isConnect4SameColumn() {
        plays.clear();
        plays.add(1);
        plays.add(2);
        plays.add(1);
        plays.add(2);
        plays.add(1);
        plays.add(2);
        plays.add(1);

        putToken(plays);
        assertThat(this.outGame.isConnect4(), is(true));
    }

    @Test
    void isConnect4SameRow() {
        plays.clear();
        plays.add(1);
        plays.add(1);
        plays.add(2);
        plays.add(2);
        plays.add(3);
        plays.add(3);
        plays.add(4);

        putToken(plays);
        assertThat(this.outGame.isConnect4(), is(true));
    }

    @Test
    void isConnect4Diagonal() {
        plays.clear();
        plays.add(1);
        plays.add(2);
        plays.add(2);
        plays.add(3);
        plays.add(3);
        plays.add(4);
        plays.add(3);
        plays.add(4);
        plays.add(4);
        plays.add(3);
        plays.add(4);

        putToken(plays);
        assertThat(this.outGame.isConnect4(), is(true));
    }

    void putToken(List<Integer> plays) {
        this.outGame.reset();
        for (int i = 0; i < plays.size(); i++) {
            this.outGame.putToken(plays.get(i));
            this.outGame.next();
        }

    }

}
