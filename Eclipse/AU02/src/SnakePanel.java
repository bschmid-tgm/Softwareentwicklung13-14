import java.awt.*;
import java.util.*;
import java.util.Random;

import javax.swing.JPanel;


public class SnakePanel extends JPanel {
	SnakeModel m;
	Point a;
	public SnakePanel(SnakeModel m){
		this.m = m;
		a = m.futter();
		this.setSize(new Dimension (600,400));
	}
	@SuppressWarnings("unchecked")
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(a.x,a.y, 20, 20);
		if(a.x==m.schlange.getLast().x&&a.y==m.schlange.getLast().y){
			a = m.futter();
			m.schlange.addLast(m.schlange.getLast());
		}
		int x = m.schlange.getLast().x;
		int y = m.schlange.getLast().y;
		Iterator <Point> i = m.schlange.iterator();
		boolean anfang = true;
		for(int a = 0;a<m.schlange.size();a++) {
				try{
					Random rand = new Random();
					float rot = rand.nextFloat();
					float gelb = rand.nextFloat();
					float blau = rand.nextFloat();
					Color randomColor = new Color(rot, gelb, blau);
					g.setColor(randomColor);
					g.fillRect(m.schlange.get(a).x,m.schlange.get(a).y,20,20);
				}catch(NoSuchElementException e){}
			anfang = false;
			this.repaint();
		}
		Color a = new Color(0,100,0);
		g.setColor(a);
		g.fillRect(x,y,20,20);
	}
}
