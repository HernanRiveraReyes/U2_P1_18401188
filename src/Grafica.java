
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chrr4
 */
public class Grafica extends JPanel{
    int[ ] valor = {10, 12, 11, 10};
    String x="";
    String y;
    Principal puntero;
    int pos=0;
    
    public Grafica(Principal p){
        //this.addMouseListener(this);
        //this.addMouseMotionListener(this);
        puntero = p;
    }
    
    public void cargarValores(){
        try{
            puntero.valores = puntero.valores.replaceAll(" ", "");
            String[] va = puntero.valores.split(",");
            for (int i = 0; i < va.length; i++) {
                valor[i]=Integer.parseInt(va[i]);
                
            }
            x=puntero.campo;
                    
        }catch(Exception e){
            
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(34, 113, 179));
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Impact",Font.PLAIN,14));
        g2.drawString(x, 37, 15);
        g2.setColor(Color.BLACK);
        g2.drawLine(35, 20, 360, 20);
        g2.drawLine(35, 20, 20, 300);
        for (int i = 0; i < valor.length; i++) {
            g2.setColor(Color.red);
            g2.fillRect((i+1)*50, 20, 20, valor[i]);
        }
        repaint();
    }
    
    
    
}
