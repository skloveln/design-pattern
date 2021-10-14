package com.github.sky;

import lombok.Getter;
import lombok.Setter;

/**
 * 描述：棋子
 *
 * @author sukai
 * @date 2021/10/14
 */
public class ChessPiece {

    private ChessPieceUnit chessPieceUnit;
    @Getter
    @Setter
    private int positionX;
    @Getter
    @Setter
    private int positionY;

    public ChessPiece(ChessPieceUnit unit, int positionX, int positionY) {
        this.chessPieceUnit = unit;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}