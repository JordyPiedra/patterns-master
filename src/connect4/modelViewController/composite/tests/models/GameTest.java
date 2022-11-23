package connect4.modelViewController.composite.tests.models;

import connect4.modelViewController.composite.main.models.Game;
import connect4.modelViewController.composite.main.types.Color;
import connect4.modelViewController.composite.main.types.Error;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class GameTest {

    private GameBuilder gameBuilder;

    @BeforeEach
    void init() {
        this.gameBuilder = new GameBuilder();
    }

    @Test
    void isConnect4HorizontalLine() {
        Game game = createGameHorizontalWinner();
        assertThat(game.isConnect4(), is(true));
    }

    @Test
    void isConnect4VerticalLine() {
        Game game = createGameVerticalWinner();
        assertThat(game.isConnect4(), is(true));
    }

    @Test
    void isConnect4DiagonalLine() {
        Game game = createGameDiagonalWinner();
        assertThat(game.isConnect4(), is(true));
    }

    @Test
    void isConnect4InvertedDiagonalLine() {
        Game game = createGameInvertedDiagonalWinner();
        assertThat(game.isConnect4(), is(true));
    }

    @Test
    void testWhenIndexColumnOutOfRange() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> new Game().putToken(7));
    }

    @Test
    void testWhenGameIsOver() {
        Game game = this.gameBuilder.full().build();
        assertIsOver(game);
    }

    @Test
    void testWhenInitialTurnIsRED() {
        Game game = createGameWithNextTurnRED();
        assertThat(game.getCurrentColor(), is(Color.RED));
    }

    @Test
    void testValidWrongColumnTokenError() {
        Game game = this.gameBuilder.build();
        assertThat(game.getPutTokenError(-1), is(Error.WRONG_COLUMN));
    }

    @Test
    void testValidFullColumnTokenError() {
        Game game = this.gameBuilder.columns(1, 1, 1, 1, 1, 1, 1).build();
        assertThat(game.getPutTokenError(1), is(Error.FULL_COLUMN));
    }

    @Test
    void testValidColumnWithoutTokenError() {
        Game game = this.gameBuilder.build();
        assertThat(game.getPutTokenError(1), is(Error.NULL));
    }


    void assertIsOver(Game game) {
        assertThat(game.isAllTokensAdded() || game.isConnect4(), is(true));
    }

    private Game createGameHorizontalWinner() {
        return createGame(1, 1, 2, 2, 3, 3, 4);
    }

    private Game createGame(Integer... columns) {
        return this.gameBuilder.initialTurn(Color.RED).columns(columns).build();
    }

    private Game createGameVerticalWinner() {
        return createGame(1, 2, 1, 2, 1, 2, 1);
    }

    private Game createGameDiagonalWinner() {
        return this.gameBuilder.initialTurn(Color.RED).columns(1, 2, 2, 3, 3, 4, 3, 4, 4, 3, 4).build();
    }

    private Game createGameInvertedDiagonalWinner() {
        return this.gameBuilder.initialTurn(Color.RED).columns(0, 0, 0, 0, 1, 1, 2, 1, 3, 2, 4, 3).build();
    }

    private Game createGameWithNextTurnRED() {
        return this.gameBuilder.initialTurn(Color.RED).columns(0, 0, 0, 0, 1, 1).build();
    }

    private Game createGameWithNextTurnBLUE() {
        return this.gameBuilder.initialTurn(Color.RED).columns(0, 0, 0).build();
    }


}
