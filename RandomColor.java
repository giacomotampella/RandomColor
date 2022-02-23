package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;

public class RandomColor extends Applet implements ActionListener{
	
	Timer t;
	int r;
	int g;
	int b;
	Random random = new Random();
	Color c;
	
	public void init() {
		t = new Timer(1000, this);
	}
	
	public void start() {
		t.start();
	}
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillRect(0, 0, getWidth(), getHeight());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		r = random.nextInt(256);
		g = random.nextInt(256);
		b = random.nextInt(256);
		
		c = new Color(r, g, b);
		repaint();
	}

}
