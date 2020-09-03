package com.laine.casimir.tetris.base.model;

import com.laine.casimir.tetris.base.tool.HoldBox;
import com.laine.casimir.tetris.base.tool.TetrominoQueue;

public class TetrisGame {

    private final HoldBox holdBox = new HoldBox();
    private TetrominoQueue tetrominoQueue;
    private Playfield playfield;
}