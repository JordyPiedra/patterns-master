package connect4.modelViewController.composite.tests.models;

import connect4.modelViewController.composite.main.models.Board;
import connect4.modelViewController.composite.main.types.Coordinate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class BoardTest {

    private BoardBuilder boardBuilder;

    @BeforeEach
    void init() {
        this.boardBuilder = new BoardBuilder();
    }

    @Test
    void isBoardEmptyWhenReset() {
        Board board = this.boardBuilder.full().build();
        board.reset();
        assertEmpty(board);
    }

    @Test
    void isBoardEmptyWhenStart() {
        Board board = this.boardBuilder.build();
        assertEmpty(board);
    }


    @Test
    void testWhenColumnIsFullTheValidColumnReturnFalse() {
        Board board = this.boardBuilder.full().build();
        assertThat(board.isNextRowValid(1), is(false));
    }

    @Test
    void testGiVeTheCurrentColorBeforeStartTheGameThenAssertionError() {
        Board board = this.boardBuilder.build();
        Assertions.assertThrows(NullPointerException.class, () -> board.getCurrentColor());
    }

    private static void assertEmpty(Board board) {
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                assertThat(board.isEmpty(new Coordinate(i, j)), is(true));
            }
        }
    }
}
