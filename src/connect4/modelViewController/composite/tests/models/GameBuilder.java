package connect4.modelViewController.composite.tests.models;

import connect4.modelViewController.composite.main.models.Game;
import connect4.modelViewController.composite.main.types.Color;

public class GameBuilder {

    private String[] rows;
    private Color color;
    private Game game;

    public GameBuilder() {
        this.rows = new String[]{
                "   ",
                "   ",
                "   "};
    }

    public GameBuilder rows(String... rows) {
        this.rows = rows;
        return this;
    }

    public GameBuilder turn(Color color) {
        this.color = color;
        return this;
    }

    public Game build() {
        this.game = new Game();
        if (this.color != null && this.game.getCurrentColor() != this.color) {
            this.game.next();
        }
        return this.game;
    }


}
