/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onesix;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class oval extends JFrame{
    
	private static oval game_game;
	public static void main(String[] args) {
		game_game = new oval();
		game_game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		game_game.setLocation(200,50);
		game_game.setSize(900,600);
		game_game.setResizable(false);
                GameField game_field = new GameField();
                game_game.add(game_field);
		game_game.setVisible(true);
		
	
}
        public static void onRepaint(Graphics g) {
            g.fillOval(10,10, 200, 200);
        }
        public static class GameField extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paint(g);
                onRepaint(g);
        }
}
}

