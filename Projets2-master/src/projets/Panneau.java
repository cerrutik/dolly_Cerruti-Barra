 package projets;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.Graphics;
/**
 * 
 * @author Benjamin
 *
 */

public class Panneau extends JPanel {
	
	public void paintComponent(Graphics g)
	{
		for (int y1=1 ; y1 < Terrain.getHauteurCarte()-1 ; y1++ )
		{
			g.drawLine(0, y1, Terrain.getLongueurCarte()-1 ,y1);
		}
		for (int x1=1 ; x1 < Terrain.getLongueurCarte()-1 ; x1++ )
		{
			g.drawLine(x1, 0, x1 ,Terrain.getHauteurCarte()-1);
		}
	}

}

