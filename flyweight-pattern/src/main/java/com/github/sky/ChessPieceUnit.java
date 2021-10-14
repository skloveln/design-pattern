package com.github.sky;

import lombok.Getter;
import lombok.Setter;

/**
 * 描述：享元类, 棋子的共性
 *
 * @author sukai
 * @date 2021/10/14
 */
@Setter
@Getter
public class ChessPieceUnit {

    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        RED, BLACK
    }

}
