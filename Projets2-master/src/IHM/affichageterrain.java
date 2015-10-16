package IHM;

import javax.swing.JPanel;

import projets.*;

public class affichageterrain extends JPanel
{
	
	public Terrain terrain = new Terrain();

	public  affichageterrain ()
	{		
		this.terrain.display();		   
	}
}
	