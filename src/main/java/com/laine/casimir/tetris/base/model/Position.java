package com.laine.casimir.tetris.base.model;

public final class Position {

    private int x;
    private int y;

    Position() {
        this(0, 0);
    }

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean collides(int x, int y) {
        return this.x == x && this.y == y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == getClass() && ((Position) obj).x == x && ((Position) obj).y == y;
    }
}
