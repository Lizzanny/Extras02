/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanoCartesiano;

/**
 *
 * @author LizzW
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlanoCartesiano extends JPanel {
    private int x1, y1, x2, y2;
    
    public PlanoCartesiano(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public PlanoCartesiano() {
        
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Dibujar plano cartesiano
        g.setColor(Color.BLACK);
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2); // Eje X
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight()); // Eje Y
        
        // Dibujar puntos
        g.setColor(Color.RED);
        g.fillOval(getWidth() / 2 + x1 - 5, getHeight() / 2 - y1 - 5, 10, 10); // Punto 1
        g.fillOval(getWidth() / 2 + x2 - 5, getHeight() / 2 - y2 - 5, 10, 10); // Punto 2
    }
    
    public void ejercutar(int x1, int y1, int x2, int y2) {
        //int x1 = 20, y1 = 30, x2 = -10, y2 = 40;
        JFrame frame = new JFrame("Plano Cartesiano");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        PlanoCartesiano panel = new PlanoCartesiano(x1, y1, x2, y2);
        frame.add(panel);
        frame.setVisible(true);
    }

}