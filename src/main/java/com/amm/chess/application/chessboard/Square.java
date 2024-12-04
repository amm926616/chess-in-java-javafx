package com.amm.chess.application.chessboard;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square {
    private final Color color;
    private final int x; // X-coordinate on the board
    private final int y; // Y-coordinate on the board
    private final double gridLength;

    public Square(Color color, int x, int y, double gridLength) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.gridLength = gridLength;
    }

    // Method to create the Rectangle representing this square
    public Rectangle getVisualRepresentation() {
        return new Rectangle(gridLength, gridLength, color);
    }

    // Getters
    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getGridLength() {
        return gridLength;
    }
}
