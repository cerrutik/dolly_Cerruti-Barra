package projets;   

import comportement.RecruterArcher;

/**
 * 
 * @author J�r�my
 *
 */
public class CampTirArc extends Batiments
{
	public CampTirArc(int x , int y, Terrain map)
	{
		super(x,y,map);
		this.pointVie = 100;
		this.pointDefense = 80;
		this.coutOr = 100;
		this.coutNourriture = 50;
		this.rechercher = true;
		this.recruter = new RecruterArcher();
		map.xcase[x][y]= new Case (x,y,11);
	}
	
	
    
	

	
	
}