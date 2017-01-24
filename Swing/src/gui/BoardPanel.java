package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Dominik C.
 */
public class BoardPanel extends JPanel implements MouseListener {
    private static final int KOLKO = 1;
    private static final int KRZYZYK = 2;

    private int[][] board = new int[3][3];

    public BoardPanel() {
        super();

        addMouseListener(this);

    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = this.getWidth();
        int height = this.getHeight();

        drawBoard(g);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == KOLKO) {
                    g.drawOval(i * width / 3, j * height / 3, width / 3, height / 3);
                }
            }
            System.out.println();
        }


    }

    private void drawBoard(Graphics g) {
        int width = this.getWidth();
        int height = this.getHeight();

        g.drawLine(0, height / 3, width, height / 3);
        g.drawLine(0, 2 * height / 3, width, 2 * height / 3);

        g.drawLine(width / 3, 0, width / 3, height);
        g.drawLine(2 * width / 3, 0, 2 * width / 3, height);
    }

    private void showBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        int cellWidth = this.getWidth() / 3;
        int cellHeight = this.getHeight() / 3;

        int row = x / cellWidth;
        int column = y / cellHeight;

        board[row][column] = KOLKO;

        showBoard();
        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
