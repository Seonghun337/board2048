package org.example;

public class BoardGame implements BoardGameSpec {
    @Override
    public Board init() {
        return null;
    }

    @Override
    public Board keyLeft() {
        return null;
    }

    @Override
    public Board keyRight() {
        Board b = new Board();
        b.init(0);
        b.set(2, 2, 9);
        return b;
    }

    @Override
    public Board keyUp() {
        return null;
    }

    @Override
    public Board keyDown() {
        return null;
    }
}
